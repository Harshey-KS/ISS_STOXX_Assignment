package Java.src.oops;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Shape {
    private static final Logger logger = LoggerFactory.getLogger(Shape.class);

    public void draw() {
        logger.info("Drawing a shape");
    }
}

class Circle extends Shape {
    private static final Logger logger = LoggerFactory.getLogger(Circle.class);

    @Override
    public void draw() {
        logger.info("Drawing a circle");
    }
}

class Rectangle extends Shape {
    private static final Logger logger = LoggerFactory.getLogger(Rectangle.class);

    @Override
    public void draw() {
        logger.info("Drawing a rectangle");
    }
}

public class PolymorphismExample {
    private static final Logger logger = LoggerFactory.getLogger(PolymorphismExample.class);

    public static void main(String[] args) {
        logger.info("Starting Polymorphism Example");
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();

        shape1.draw();
        shape2.draw();
        logger.info("Finished Polymorphism Example");
    }
}
