package Java.collections;

import java.util.*;

public class Collection {
    public static void main(String[] args) {
        // List Example
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        System.out.println("List: " + list);

        // Set Example
        Set<String> set = new HashSet<>(list);
        set.add("Cherry");
        System.out.println("Set: " + set);

        // Map Example
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        System.out.println("Map: " + map);
    }
}