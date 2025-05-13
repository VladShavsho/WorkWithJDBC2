package org.example.app;

import java.sql.Connection;
import org.example.app.database.DBConn;
import org.example.app.database.EmployeeDAO;

public class Main {
    public static void main(String[] args) {
        Connection conn = DBConn.connect();

        if (conn != null) {
            EmployeeDAO dao = new EmployeeDAO(conn);
            dao.addEmployee("Іван Петренко", 30, "Інженер", 15000.0f);
        } else {
            System.out.println("З'єднання не встановлено. Завершення програми.");
        }
    }
}