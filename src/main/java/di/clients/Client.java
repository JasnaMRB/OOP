package di.clients;

import di.config.VehicleConfig;
import di.vehicles.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

    public static void main(String args[]) {
        ApplicationContext context = new AnnotationConfigApplicationContext(VehicleConfig.class);
        Vehicle car = (Vehicle) context.getBean("mrBeansCar");
        car.crankIgnition();
    }
}
