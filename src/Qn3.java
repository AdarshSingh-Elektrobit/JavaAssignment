import java.util.Scanner;

public class Qn3 {
    public Qn3() {
        //3. Write a Java program that takes a number as input and prints its multiplication table up to 10. (Hint- use Loop).

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int num = Integer.parseInt(sc.next());

        for (int i = 1; i <=10; i++)
        {
            System.out.println(num + "*" + i + "=" +num*i);
        }
    }
}
