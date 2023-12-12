import java.util.Scanner;

public class Qn10 {

    //10. Write a Java program to compare two numbers. (take user input).
    public Qn10() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number 1 : ");
        int x = Integer.parseInt(sc.next());

        System.out.println("Enter Number 1 : ");
        int y = Integer.parseInt(sc.next());

        if ((x > y)) {
            System.out.println(x + " is greater than " + y);
        } else {
            System.out.println(y + " is greater than " + x);
        }

    }
}
