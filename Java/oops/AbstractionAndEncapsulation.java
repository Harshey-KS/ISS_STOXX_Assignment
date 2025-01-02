package Java.src.oops;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

abstract class Vehicle {
    public abstract void move();
}

class Bike extends Vehicle {
    private static final Logger logger = LoggerFactory.getLogger(Bike.class);

    @Override
    public void move() {
        logger.info("Bike is moving");
    }
}

class Car extends Vehicle {
    private static final Logger logger = LoggerFactory.getLogger(Car.class);

    @Override
    public void move() {
        logger.info("Car is moving");
    }
}

public class AbstractionAndEncapsulation {
    private static final Logger logger = LoggerFactory.getLogger(AbstractionAndEncapsulation.class);

    public static void main(String[] args) {
        logger.info("Starting Abstraction and Encapsulation Example");
        Vehicle bike = new Bike();
        Vehicle car = new Car();
        bike.move();
        car.move();
        logger.info("Finished Example");
    }
}
