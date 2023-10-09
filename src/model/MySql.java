package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySql {

    private static Connection connection;
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Thanujitha@#123";
    private static final String DATABASE = "vehicle_rental_services";

    public static Statement createConnection() throws Exception {
        if (connection == null) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + DATABASE, USERNAME, PASSWORD);

        }

        Statement statement = connection.createStatement();
        return statement;

    }

    public static void iud(String query) {
        try {
            createConnection().executeUpdate(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ResultSet search(String query) throws Exception {
        return createConnection().executeQuery(query);
    }

    public static Connection getConnection() {
        try {
            if (connection == null) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc://localhost:3306" + DATABASE, USERNAME, PASSWORD);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

}
