package designpatterns.observer.domain.dao;

import designpatterns.observer.domain.Employee;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class EmployeeDAO {
    Employee emp1 = new Employee("Mike", null, 5000, false);
    Employee emp2 = new Employee("Steve", null, 4500, false);
    Employee emp3 = new Employee("John", null, 7000, false);
    Employee emp4 = new Employee("Pat", null, 6000, false);
    Employee emp5 = new Employee("Joe", null, 8000, false);

    List<Employee> employeeList;

    public List<Employee> generateEmployees() {
        employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        return employeeList;
    }

    public void addEmployee(Employee emp) {
        employeeList.add(emp);
    }
}
