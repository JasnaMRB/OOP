package di.config;

import di.parts.SmallEngine;
import di.vehicles.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VehicleConfig {

    @Bean
    public Vehicle mrBeansCar() {
        return new Vehicle(new SmallEngine(500));
    }
}
