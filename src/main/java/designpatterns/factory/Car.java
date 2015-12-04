package designpatterns.factory;

public class Car implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Started a small engine of car...");

    }
}
