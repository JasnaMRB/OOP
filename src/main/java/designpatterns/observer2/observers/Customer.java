package designpatterns.observer2.observers;


public class Customer implements WaitingCustomer {
    private String name;
    private String drinkOrdered;

    public Customer(String name, String drinkOrdered) {
        this.name = name;
        this.drinkOrdered = drinkOrdered;
    }
    @Override
    public String getDrinkOrdered() {
        return drinkOrdered;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void orderReady(String drink) {
        if (drinkOrdered.equals(drink)) {
            exitStore();
        }
    }

    public void exitStore() {
        System.out.println(name + " received " + drinkOrdered + " and Is leaving the store now." );
    }
}
