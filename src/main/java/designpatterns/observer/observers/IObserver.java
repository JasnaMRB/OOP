package designpatterns.observer.observers;

import designpatterns.observer.domain.Employee;

public interface IObserver {
    void callMe(Employee emp, String msg);
}
