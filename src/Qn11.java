import java.util.Scanner;

public class Qn11 {

    //11. Write a Java program to count letters, spaces, numbers and other characters in an input string.
    public Qn11() {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter String : ");
//        String s= (sc.next());
        String s = "This 123 ''' ss";

        int letters = 0,spaces=0,numbers=0,splChar = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if(Character.isLetter(s.charAt(i)))
            {
                letters++;
            }

            if(Character.isDigit(s.charAt(i)))
            {
                numbers++;
            }

            if(s.charAt(i) == ' ')
            {
                spaces++;
            }
            if(!Character.isLetterOrDigit(s.charAt(i)) && s.charAt(i)!=' ')
            {
                splChar++;
            }
        }

        System.out.println("The Given String contains "+ letters+ " letters, " + numbers+ " numbers, " +spaces+ " spaces, and "+  splChar + " special Characters");
    }

}
