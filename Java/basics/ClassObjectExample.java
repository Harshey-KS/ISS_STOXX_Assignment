package Java.src.basics;

class Car {
    // Instance variables (state)
    String brand;
    int speed;

    // Constructor
    public Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Method (behavior)
    public void drive() {
        System.out.println(brand + " is driving at " + speed + " km/h.");
    }
}

public class ClassObjectExample {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 120);
        car.drive();
    }
}