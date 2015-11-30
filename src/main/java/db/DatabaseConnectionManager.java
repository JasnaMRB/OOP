package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {
    private Connection conn;
    public void getManagerInstance(DatabaseConnectionManager connectionManager) {}
    public void connect() throws SQLException {
        // process specific to DB connection details
        conn = DriverManager.getConnection("Some/Database/URL");
        System.out.println("Established DB Connection...");

    }

    public Connection getConnectionObject() {
        return conn;
    }
    public void disconnect() {
        //conn.close();
        System.out.println("Disconnected from DB...");
    }
}
