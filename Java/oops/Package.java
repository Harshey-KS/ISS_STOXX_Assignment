package Java.src.oops;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import Java.src.basics.ClassObjectExample; // Importing a class from another package

public class Package {
    private static final Logger logger = LoggerFactory.getLogger(Package.class);

    public static void main(String[] args) {
        logger.info("Package example with imports");
        ClassObjectExample.main(null); // Accessing main method of another class
    }
}
