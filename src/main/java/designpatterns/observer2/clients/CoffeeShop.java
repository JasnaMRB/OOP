package designpatterns.observer2.clients;

import designpatterns.observer2.observers.Customer;
import designpatterns.observer2.subjects.CoffeeAttendant;

public class CoffeeShop {
    public static void main(String[] args) {

        CoffeeAttendant attendant = new CoffeeAttendant();
        Customer customer = new Customer("Jim", "Fizz");
        attendant.receiveOrder(customer);
        Customer customer2 = new Customer("Sally", "Coke");
        attendant.receiveOrder(customer2);
        attendant.prepareDrink("Fizz");
        attendant.prepareDrink("Coke");
        attendant.callOutOrders();
    }
}
