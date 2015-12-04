package designpatterns.observer.subjects;

import designpatterns.observer.observers.IObserver;

public interface ISubject {
    void notifyObservers();
    void registerObserver(IObserver observer);
    void removeObserver(IObserver observer);
}
