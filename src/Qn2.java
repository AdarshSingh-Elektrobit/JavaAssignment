import java.util.Scanner;

public class Qn2 {
    public Qn2() {
//        2. Write a Java program to print the sum of two numbers, subtraction, multiplication, division. (User Input)

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number 1: ");
        int num1 = Integer.parseInt(sc.next());

        System.out.println("Enter Number 2: ");
        int num2 = Integer.parseInt(sc.next());

        int result = num1+num2;
        System.out.println("The result of " + num1 + " and " + num2 + " is " + result);


    }
}
