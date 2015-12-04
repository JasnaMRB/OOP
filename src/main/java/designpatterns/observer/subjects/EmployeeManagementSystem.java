package designpatterns.observer.subjects;

import designpatterns.observer.domain.Employee;
import designpatterns.observer.domain.dao.EmployeeDAO;
import designpatterns.observer.observers.IObserver;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem implements ISubject {

    private List<IObserver> observerList;
    private Employee employee;
    private String msg = null;
    private EmployeeDAO employeeDAO;
    private List<Employee> employees;

    public EmployeeManagementSystem() {
        observerList = new ArrayList<>();
        employeeDAO = new EmployeeDAO();
        employees = employeeDAO.generateEmployees();
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(observer -> observer.callMe(employee, msg));
    }
    @Override
    public void registerObserver(IObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observerList.remove(observerList.indexOf(observer));
    }

    public void modifyEmployeeName(int employeeId, String employeeName) {
        employees.forEach(emp ->
        { if (employeeId == emp.employeeID) {
                emp.setName(employeeName);
                this.msg = "Employee name has been modified.";
                notifyObservers();
            }});
    }

    public void hireNewEmployee(Employee emp) {
        this.employee = emp;
        this.msg = "New Hire: " + emp.getName();
        employees.add(emp);
        notifyObservers();
    }
}
