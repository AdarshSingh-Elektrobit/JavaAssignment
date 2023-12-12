import java.util.Scanner;


public class Qn6 {
    // Swap - 6. In above program with user input and without using third variable

    public Qn6() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1 : ");
        int x = Integer.parseInt(sc.next());

        System.out.println("Enter number 1 : ");
        int y = Integer.parseInt(sc.next());



        System.out.println("value of x is :"+ x );
        System.out.println("value of y is :"+ y );

        System.out.println("Swapping 2 variables");
        x = x + y; //10+20=30
        y = x - y; //30-20=10
        x = x - y; //30-10=20

        System.out.println("value of x is :"+ x );
        System.out.println("value of y is :"+ y );
    }
}
