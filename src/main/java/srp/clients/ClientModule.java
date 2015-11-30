package srp.clients;

import srp.core.domain.Employee;
import srp.core.domain.dao.EmployeeDAO;
import srp.core.reporting.EmployeeReportFormatter;
import srp.core.reporting.FormatType;

public class ClientModule {

    public static void main (String[] args) {
        Employee peggy = new Employee(1, "peggy", "accounting", true);
        ClientModule.hireNewEmployee(peggy);
        printEmployeeReport(peggy, FormatType.XML);
    }

    public static void hireNewEmployee(Employee employee) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.saveEmployee(employee);
        System.out.println("Hiring new employee...");
    }
    public static void terminateEmployee(Employee employee) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.deleteEmployee(employee);
        System.out.println("Terminating employee...");
    }
    public static void printEmployeeReport(Employee employee, FormatType formatType) {
        EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, formatType);
        System.out.println(formatter.getFormattedEmployee());
    }
}