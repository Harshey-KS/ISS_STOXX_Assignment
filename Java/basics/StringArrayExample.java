package Java.src.basics;

public class StringArrayExample {
    public static void main(String[] args) {
        // String operations
        String text = "Hello, World!";
        System.out.println("Length: " + text.length());
        System.out.println("Substring: " + text.substring(0, 5));

        // Array operations
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
    }
}