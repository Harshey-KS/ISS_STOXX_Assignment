package Java.src.basics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoopExample {
    private static final Logger logger = LoggerFactory.getLogger(LoopExample.class);

    public static void main(String[] args) {
        // Decision making
        int number = 10;
        if (number > 0) {
            logger.info("Positive number");
        } else {
            logger.info("Negative number");
        }

        // For loop
        for (int i = 0; i < 5; i++) {
            logger.info("For loop: {}", i);
        }

        // While loop
        int j = 0;
        while (j < 5) {
            logger.info("While loop: {}", j);
            j++;
        }

        // Switch case
        int day = 3;
        switch (day) {
            case 1: logger.info("Monday"); break;
            case 2: logger.info("Tuesday"); break;
            case 3: logger.info("Wednesday"); break;
            default: logger.info("Invalid day");
        }
    }
}
