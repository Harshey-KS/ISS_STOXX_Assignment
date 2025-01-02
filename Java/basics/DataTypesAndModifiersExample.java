package Java.src.basics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DataTypesAndModifiersExample {
    // Logger instance
    private static final Logger logger = LoggerFactory.getLogger(DataTypesAndModifiersExample.class);

    // Static variable (shared across instances)
    static int sharedCounter = 0;

    // Final variable
    final int maxLimit = 100;

    // Constructor
    public DataTypesAndModifiersExample() {
        sharedCounter++;
        logger.info("New instance created. Shared Counter incremented to {}", sharedCounter);
    }

    public static void main(String[] args) {
        int age = 25; // Primitive datatype
        String name = "John"; // Reference datatype
        logger.info("Age: {}, Name: {}", age, name);

        DataTypesAndModifiersExample obj1 = new DataTypesAndModifiersExample();
        DataTypesAndModifiersExample obj2 = new DataTypesAndModifiersExample();
        logger.info("Final Shared Counter: {}", sharedCounter);
    }
}
