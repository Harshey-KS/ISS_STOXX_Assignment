package Java.src.collections;

import java.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}

public class CustomSort {
    private static final Logger logger = LoggerFactory.getLogger(CustomSort.class);

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "John"));
        students.add(new Student(1, "Alice"));
        students.add(new Student(2, "Bob"));

        // Sort using Comparable
        students.sort(Comparator.comparingInt(Student::getId));
        logger.info("Sorted by ID: {}", students);

        // Sort using Comparator
        students.sort(Comparator.comparing(Student::getName));
        logger.info("Sorted by Name: {}", students);
    }
}
