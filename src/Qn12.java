import java.util.Scanner;

public class Qn12 {
    //12. Write a Java program to print the ASCII value of a given character.
    public Qn12() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter character : ");
        String s= (sc.next());

        System.out.println("The ASCII value of "+s+ " is "+ (int)s.charAt(0));


    }
}
