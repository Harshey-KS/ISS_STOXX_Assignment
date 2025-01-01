package Java.src.oops;

class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();

        shape1.draw();
        shape2.draw();
    }
}