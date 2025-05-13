package org.example.app.database;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConn {
    public static Connection connect() {
        Properties props = new Properties();
        Connection conn = null;

        try {
            System.out.println("Завантаження файлу jdbc.properties...");
            props.load(DBConn.class.getResourceAsStream("/db/jdbc.properties"));

            String url = props.getProperty("dbDriver") + props.getProperty("dbName");
            String username = props.getProperty("username");
            String password = props.getProperty("password");

            System.out.println("Спроба з'єднання з: " + url);
            System.out.println("Користувач: " + username);

            conn = DriverManager.getConnection(url, username, password);
            System.out.println("З'єднання успішне!");

        } catch (SQLException e) {
            System.out.println("SQL помилка: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Помилка читання jdbc.properties: " + e.getMessage());
        }

        return conn;
    }
}
