import java.util.Scanner;

public class Qn8 {
    //8. Write a Java program to convert a binary number to an octal number.

    public Qn8() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Binary Number : ");
        int x = Integer.parseInt(sc.next());

        System.out.println("Octal equivalent of "+x + " is "+ binToOctal(x));
    }

    private static int binToOctal(int binaryNumber) {

            int octalNumber = 0, decimalNumber = 0, i = 0;

            while (binaryNumber != 0) {
                decimalNumber += (binaryNumber % 10) * Math.pow(2, i);
                ++i;
                binaryNumber /= 10;
            }

            i = 1;

            while (decimalNumber != 0) {
                octalNumber += (decimalNumber % 8) * i;
                decimalNumber /= 8;
                i *= 10;
            }

            return octalNumber;
        }
    }


