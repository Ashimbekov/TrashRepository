package crud;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class DbFunctions {
    public Connection connect_to_db(String dbname, String user, String pass){
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+dbname, user, pass);
            if(conn != null){
                System.out.println("Connected to PostgreSQL database");
            } else {
                System.out.println("Failed to connect to PostgreSQL database");
            }
        } catch (Exception e){
            System.out.println(e);
        }
        return conn;
    }

    public void createTable(Connection conn, String table_name){
        Statement stmt;
        try {
            String query = "CREATE TABLE %s(empid SERIAL, name varchar(200), address varchar(200), primary key (empid));".formatted(table_name);
            stmt = conn.createStatement();
            stmt.executeUpdate(query);
            System.out.println("Table created");
        } catch (Exception e){
            System.out.println(e);
        }
    }

    public void insertData(Connection conn, String table_name, String name, String address){
        Statement stmt;
        try {
//            String query = "INSERT INTO %s(name,address) VALUES(%s, %s);".formatted(table_name, name, address);
            String q = "INSERT INTO %s(name,address) VALUES(%s, %s);".formatted(table_name, name, address);

            stmt = conn.createStatement();
            stmt.executeUpdate(q);
            System.out.println("Table inserted");
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
