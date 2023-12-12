import java.util.Scanner;

public class Qn9 {
    //9. Write a Java program to convert an octal number to a hexadecimal number.
    public Qn9() {
        Scanner sc = new Scanner(System.in);
        int oct, dec=0, i=0, t;
        System.out.println("Enter Binary Number : ");
        oct = Integer.parseInt(sc.next());
        int temp =oct;
        while(oct != 0)
        {
            dec =dec + (oct%10) *(int)Math.pow(8, i);
            i++;
            oct = oct/10;
        }

        System.out.println("Octal equivalent of "+temp + " is "+ octalToHex(dec));
    }

    private static String octalToHex(int q)
    {
        char[] a ={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem;
        String hexdec="";
        while(q != 0)
        {
            rem=q%16;
            hexdec= a[rem] + hexdec;
            q= q/16;
        }
        return hexdec;
    }
}
