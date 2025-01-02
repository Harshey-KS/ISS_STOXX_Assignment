package Java.src.basics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Car {
    // Instance variables (state)
    private String brand;
    private int speed;

    // Logger instance
    private static final Logger logger = LoggerFactory.getLogger(Car.class);

    // Constructor
    public Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
        logger.info("Car object created with brand: {} and speed: {} km/h", brand, speed);
    }

    // Method (behavior)
    public void drive() {
        logger.info("{} is driving at {} km/h.", brand, speed);
    }
}

public class ClassObjectExample {
    private static final Logger logger = LoggerFactory.getLogger(ClassObjectExample.class);

    public static void main(String[] args) {
        logger.info("Program started");

        // Create a Car object
        Car car = new Car("Toyota", 120);

        // Call the drive method
        car.drive();

        logger.info("Program ended");
    }
}
