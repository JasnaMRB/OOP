package designpatterns.observer.observers;

import designpatterns.observer.domain.Employee;

public class PayrollDepartment implements IObserver {
    @Override
    public void callMe(Employee emp, String msg) {
        System.out.print("Payroll Department notified...");
        System.out.println(msg + " " + emp.getName());
    }
}
