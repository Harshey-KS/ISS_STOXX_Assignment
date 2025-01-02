package Java.src.basics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringArrayExample {
    private static final Logger logger = LoggerFactory.getLogger(StringArrayExample.class);

    public static void main(String[] args) {
        // String operations
        String text = "Hello, World!";
        logger.info("Length: {}", text.length());
        logger.info("Substring: {}", text.substring(0, 5));

        // Array operations
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            logger.info("Number: {}", num);
        }
    }
}
