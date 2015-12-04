package designpatterns.observer2.subjects;

import designpatterns.observer2.observers.WaitingCustomer;

import java.util.LinkedList;
import java.util.List;

public class CoffeeAttendant {

    private List<WaitingCustomer> customerList;
    private List<String> completedDrinks;

    public CoffeeAttendant() {
        customerList = new LinkedList<>();
        completedDrinks = new LinkedList<>();
    }
    public void receiveOrder(WaitingCustomer customer) {
        customerList.add(customer);
        System.out.println("Thanks, " + customer.getName() + ". I'll work on your " + customer.getDrinkOrdered() + ".");
    }


    public void prepareDrink(String drink) {
        System.out.println("Preparing drink " + drink + "...");
        double timeTaken = Math.random() + 10;
        try {
            Thread.sleep((long) (timeTaken) * 1000);
            completedDrinks.add(drink);
        } catch (InterruptedException e) {
            System.out.println("For some reason, the drink " +  drink + " was not prepared!");
        }
    }

    public void callOutOrders() {
        completedDrinks.forEach(drink -> {
            System.out.println("Completed " + drink + "!");
            customerList.forEach(customer -> customer.orderReady(drink));
        });
    }

}
