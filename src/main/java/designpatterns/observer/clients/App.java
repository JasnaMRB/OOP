package designpatterns.observer.clients;

import designpatterns.observer.domain.Employee;
import designpatterns.observer.subjects.EmployeeManagementSystem;
import designpatterns.observer.observers.HRDepartment;
import designpatterns.observer.observers.IObserver;
import designpatterns.observer.observers.PayrollDepartment;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        IObserver payroll = new PayrollDepartment();
        IObserver hrSystem = new HRDepartment();

        EmployeeManagementSystem ems = new EmployeeManagementSystem();

        ems.registerObserver(payroll);
        ems.registerObserver(hrSystem);

        Employee bob = new Employee("Bob", new Date(), 35000, true);
        System.out.println(bob.getName());
        ems.hireNewEmployee(bob);
        ems.modifyEmployeeName(5, "Imtiaz");
    }
}
