package Java.src.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExceptionHandling {
    private static final Logger logger = LoggerFactory.getLogger(ExceptionHandling.class);

    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Will throw ArithmeticException
        } catch (ArithmeticException e) {
            logger.error("Caught exception: {}", e.getMessage(), e);
        } finally {
            logger.info("Finally block executed.");
        }

        // Demonstrating throw vs throws
        try {
            validateAge(17);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
    }

    public static void validateAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be 18 or above.");
        }
    }
}
