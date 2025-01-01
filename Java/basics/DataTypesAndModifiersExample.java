package Java.src.basics;

public class DataTypesAndModifiersExample {
    // Static variable (shared across instances)
    static int sharedCounter = 0;

    // Final variable
    final int maxLimit = 100;

    // Constructor
    public DataTypesAndModifiersExample() {
        sharedCounter++;
    }

    public static void main(String[] args) {
        int age = 25; // Primitive datatype
        String name = "John"; // Reference datatype
        System.out.println("Age: " + age + ", Name: " + name);

        DataTypesAndModifiersExample obj1 = new DataTypesAndModifiersExample();
        DataTypesAndModifiersExample obj2 = new DataTypesAndModifiersExample();
        System.out.println("Shared Counter: " + sharedCounter);
    }
}