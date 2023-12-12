import java.util.Scanner;

public class Qn18 {
    /*18. Write a Java program that accepts two integer values from the user and returns the largest value. However,
    if the two values are the same,return 0 and find the smallest value if the two values have the same remainder when divided by 6.*/

    public Qn18() {
        Scanner scanner = new Scanner(System.in);

        // Accepting two integer values from the user
        System.out.print("Enter the first integer value: ");
        int firstValue = scanner.nextInt();

        System.out.print("Enter the second integer value: ");
        int secondValue = scanner.nextInt();

        int result = findLargestValue(firstValue, secondValue);
        System.out.println("Result: " + result);

        scanner.close();
    }

    public static int findLargestValue(int num1, int num2) {
        if (num1 == num2) {
            return 0; // If the two values are the same, return 0
        } else if (num1 % 6 == num2 % 6) {
            // If the remainder when divided by 6 is the same for both values
            // Find and return the smallest value among the two
            return Math.min(num1, num2);
        } else {
            // Return the largest value among the two
            return Math.max(num1, num2);
        }
    }
}

