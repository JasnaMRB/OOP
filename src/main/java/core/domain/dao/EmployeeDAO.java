package core.domain.dao;

import core.domain.Employee;
import db.DatabaseConnectionManager;

public class EmployeeDAO {

    private DatabaseConnectionManager connectionManager;

    public void saveEmployee(Employee employee) {
        /* DatabaseConnectionManager databaseConnection = new DatabaseConnectionManager().getManagerInstance();
        databaseConnection.connect();
        DatabaseConnectionManager.getManagerInstance().getConnectionObject().prepareStatement("sql statement to save");
         databaseConnection.disconnect();
         */
        System.out.println("Saving employee to DB: " + employee);
    }
    public void deleteEmployee(Employee employee) {
        /*
        DatabaseConnectManager.getManagerInstance().getConnectionObject().prepareStatement("sql statement thing");
         */
        System.out.println("Deleting employee from DB" + employee);
    }

}
