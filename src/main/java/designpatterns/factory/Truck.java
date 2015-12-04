package designpatterns.factory;

public class Truck implements Vehicle{
    @Override
    public void startEngine() {
        System.out.println("Starting large engine of truck...");
    }

}
