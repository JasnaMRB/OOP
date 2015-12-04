package designpatterns.observer2.observers;

public interface WaitingCustomer {

    void orderReady(String drink);
    String getName();
    String getDrinkOrdered();
}
