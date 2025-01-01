package Java.src.exceptions;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }

        // Demonstrating throw vs throws
        try {
            validateAge(17);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validateAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be 18 or above.");
        }
    }
}