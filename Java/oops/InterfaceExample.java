package Java.src.oops;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Animal {
    void sound();
}

class Cat implements Animal {
    private static final Logger logger = LoggerFactory.getLogger(Cat.class);

    @Override
    public void sound() {
        logger.info("Cat meows");
    }
}

public class InterfaceExample {
    private static final Logger logger = LoggerFactory.getLogger(InterfaceExample.class);

    public static void main(String[] args) {
        logger.info("Starting Interface Example");
        Animal cat = new Cat();
        cat.sound();
        logger.info("Finished Example");
    }
}
