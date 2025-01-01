package Java.src.oops;

abstract class Vehicle {
    public abstract void move();
}

class Bike extends Vehicle {
    @Override
    public void move() {
        System.out.println("Bike is moving");
    }
}

class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}

public class AbstractionAndEncapsulation {
    public static void main(String[] args) {
        Vehicle bike = new Bike();
        Vehicle car = new Car();
        bike.move();
        car.move();
    }
}