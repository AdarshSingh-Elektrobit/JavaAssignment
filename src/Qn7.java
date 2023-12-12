import java.util.Scanner;

public class Qn7 {
    //7. Write a Java program to add two binary numbers and divide them. (both in different program).
    public Qn7() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Binary Number 1: ");
        int x = Integer.parseInt(sc.next());

        System.out.println("Enter Binary Number 2: ");
        int y = Integer.parseInt(sc.next());

        System.out.println("Addition of "+ x + " and " + y + " is 00"+ add2Bin(x,y));

    }

    private static int add2Bin(int n1, int n2){

        int sum = 0;
        int carry = 0;
        int powerOfTen = 1; // 10^0

        while(n1 > 0 || n2 > 0 || carry > 0){

            int digit1 = n1 % 10;
            n1 = n1 / 10;

            int digit2 = n2 % 10;
            n2 = n2 / 10;

            int digit = digit1 + digit2 + carry;

            carry = digit / 2;
            digit = digit % 2;

            sum = sum + digit * powerOfTen;

            powerOfTen = powerOfTen * 10;
        }

        return sum;
    }
}
