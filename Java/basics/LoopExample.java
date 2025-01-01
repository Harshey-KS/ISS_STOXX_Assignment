package Java.src.basics;

public class LoopExample {
    public static void main(String[] args) {
        // Decision making
        int number = 10;
        if (number > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative number");
        }

        // For loop
        for (int i = 0; i < 5; i++) {
            System.out.println("For loop: " + i);
        }

        // While loop
        int j = 0;
        while (j < 5) {
            System.out.println("While loop: " + j);
            j++;
        }

        // Switch case
        int day = 3;
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            default: System.out.println("Invalid day");
        }
    }
}