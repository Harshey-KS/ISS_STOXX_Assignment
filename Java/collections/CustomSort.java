package Java.src.collections;

import java.util.*;

public class CustomSort {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "John"));
        students.add(new Student(1, "Alice"));
        students.add(new Student(2, "Bob"));

        // Sort using Comparable
        students.sort(Comparator.comparingInt(Student::getId));
        System.out.println("Sorted by ID: " + students);

        // Sort using Comparator
        students.sort(Comparator.comparing(Student::getName));
        System.out.println("Sorted by Name: " + students);
    }
}