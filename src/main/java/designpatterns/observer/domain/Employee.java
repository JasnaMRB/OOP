package designpatterns.observer.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class Employee {
    private String name;
    private Date hireDate;
    private long salary;
    private boolean active;
    public int employeeID;

    private static int COUNTER;

    public Employee(String name, Date hireDate, long salary, boolean active) {
        this.name = name;
        this.hireDate = hireDate;
        this.salary = salary;
        this.active = active;
       employeeID = ++COUNTER;
    }

    public int getId() {
        return this.employeeID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
