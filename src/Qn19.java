import java.util.Scanner;

public class Qn19 {

    //19. Write a Java program to accept a number and check whether the number is even or not. Prints 1 if the number is even or 0 if odd.

    public Qn19() {
        Scanner scanner = new Scanner(System.in);

        // Accepting two integer values from the user
        System.out.print("Enter the first integer value: ");
        int firstValue = scanner.nextInt();
        int result =0;
        result = firstValue%2==0?1:0;
        System.out.println(firstValue + " is " + result);
    }
}
