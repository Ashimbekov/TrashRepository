package CRUD2;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class ProductDb {

    public static int add(List<Product> products) {
        var sql = "insert into products (name, price) " + "values(?,?)";

        try (var conn = DB.connect();
             var pstmt = conn.prepareStatement(sql)){
            for (var product : products) {
                pstmt.setString(1, product.getName());
                pstmt.setDouble(2, product.getPrice());
                pstmt.addBatch();
            }

            pstmt.executeBatch();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return -1;
    }
}
