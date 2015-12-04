package designpatterns.factory;

public class ElectricCar implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Pushed engine to start electric car");
    }
}
