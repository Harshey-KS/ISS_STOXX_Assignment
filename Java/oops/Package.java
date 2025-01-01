package Java.src.oops;

import Java.src.basics.ClassObjectExample; // Importing a class from another package

public class Package {
    public static void main(String[] args) {
        System.out.println("Package example with imports");
        ClassObjectExample.main(null); // Accessing main method of another class
    }
}