package CRUD2;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DatabaseConfig {
    private static final Properties prop = new Properties();

    static {
        try (InputStream in = DatabaseConfig.class.getClassLoader().getResourceAsStream("db.properties")) {
            if (in == null){
                System.out.println("Не удалось найти db.properties");
                System.exit(1);
            }

            prop.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getDbUrl(){
        return prop.getProperty("db.url");
    }

    public static String getDbUser(){
        return prop.getProperty("db.user");
    }

    public static String getDbPassword(){
        return prop.getProperty("db.password");
    }
}

