package designpatterns.observer.observers;

import designpatterns.observer.domain.Employee;

public class HRDepartment implements IObserver {
    @Override
    public void callMe(Employee emp, String msg) {
        System.out.print("Human Resources Department notified...");
        System.out.println(msg + " " + emp.getName());
    }
}
