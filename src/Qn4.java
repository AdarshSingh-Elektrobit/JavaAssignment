import java.util.Scanner;

public class Qn4 {
    //4. Write a Java program to print the area and perimeter of a rectangle. (use user input).
    public Qn4() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of rectangle: ");
        int l = Integer.parseInt(sc.next());

        System.out.println("Enter breadth of rectangle: ");
        int b = Integer.parseInt(sc.next());

        System.out.println("Area of triangle is: "+ l*b);
        System.out.println("Perimeter of triangle is: "+ 2*(l+b));

    }
}
