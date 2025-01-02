package Java.src.oops;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Animal {
    private static final Logger logger = LoggerFactory.getLogger(Animal.class);

    public void sound() {
        logger.info("Animal makes a sound");
    }
}

class Dog extends Animal {
    private static final Logger logger = LoggerFactory.getLogger(Dog.class);

    @Override
    public void sound() {
        logger.info("Dog barks");
    }
}

public class InheritanceExample {
    private static final Logger logger = LoggerFactory.getLogger(InheritanceExample.class);

    public static void main(String[] args) {
        logger.info("Starting Inheritance Example");
        Animal animal = new Dog();
        animal.sound();
        logger.info("Finished Example");
    }
}
