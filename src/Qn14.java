import java.lang.reflect.Array;
import java.util.ArrayList;

public class Qn14 {
    //14. Write a Java program to print numbers between 1 and 100 divisible by 3, 5 and both.
    public Qn14() {
        ArrayList<Integer> noDivBy3 = new ArrayList<Integer>();
        ArrayList<Integer> noDivBy5 = new ArrayList<Integer>();
        ArrayList<Integer> noDivBy3and5 = new ArrayList<Integer>();
        for (int i = 1; i <=100 ; i++) {
            if(i%3==0)
            {
                noDivBy3.add(i);
            }
            if(i%5==0)
            {
                noDivBy5.add(i);
            }
            if(i%3==0 && i%5==0)
            {
                noDivBy3and5.add(i);
            }
        }

        System.out.println("The numbers between 1 and 100 divisible by 3 are :");
        for(int i:noDivBy3)
        {
            System.out.print(i+", ");
        }
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------------------------");

        System.out.println("The numbers between 1 and 100 divisible by 5 are :");
        for(int i:noDivBy5)
        {
            System.out.print(i+", ");
        }
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------------------------");


        System.out.println("The numbers between 1 and 100 divisible by 3 and 5 are :");
        for(int i:noDivBy3and5)
        {
            System.out.print(i+", ");
        }


    }
}
