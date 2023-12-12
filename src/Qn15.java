import java.util.Scanner;

public class Qn15 {
    //15. Take input of age of 3 people by user and determine oldest and youngest among them.
    public Qn15() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Age 1 : ");
        int x = Integer.parseInt(sc.next());

        System.out.println("Enter Age 2 : ");
        int y = Integer.parseInt(sc.next());

        System.out.println("Enter Age 3 : ");
        int z = Integer.parseInt(sc.next());

        int o =  (x > y) ? (x > z ? x : z) : (y > z ? y : z);
        int yn =  (x < y) ? (x < z ? x : z) : (y < z ? y : z);
        System.out.println("The oldest among all is "+ o);
        System.out.println("The oldest among all is "+ yn);


    }
}
