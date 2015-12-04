package principles.di.config;

import principles.di.parts.SmallEngine;
import principles.di.vehicles.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VehicleConfig {

    @Bean
    public Vehicle mrBeansCar() {
        return new Vehicle(new SmallEngine(500));
    }
}
