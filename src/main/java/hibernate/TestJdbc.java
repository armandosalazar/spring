package hibernate;

import java.sql.DriverManager;

public class TestJdbc {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:8889/hb_schema?useSSL=false";
        String user = "root";
        String password = "root";
        try {
            System.out.println("Connecting to database: " + url);
            DriverManager.getConnection(url, user, password);
            System.out.println("Connection successful!");

        } catch (Exception e) {
            System.out.println("Connection failed!, error: " + e.getMessage());
        }
    }
}
