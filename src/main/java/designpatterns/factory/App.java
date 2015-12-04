package designpatterns.factory;

public class App {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle sedan = vehicleFactory.getVehicle(VehicleType.CAR);
        sedan.startEngine();
    }
}
