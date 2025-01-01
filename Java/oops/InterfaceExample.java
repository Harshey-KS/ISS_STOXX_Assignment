package Java.src.oops;

interface Animal {
    void sound();
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.sound();
    }
}