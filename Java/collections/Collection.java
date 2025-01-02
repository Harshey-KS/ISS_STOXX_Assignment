package Java.collections;

import java.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Collection {
    private static final Logger logger = LoggerFactory.getLogger(Collection.class);

    public static void main(String[] args) {
        // List Example
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        logger.info("List: {}", list);

        // Set Example
        Set<String> set = new HashSet<>(list);
        set.add("Cherry");
        logger.info("Set: {}", set);

        // Map Example
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        logger.info("Map: {}", map);
    }
}
