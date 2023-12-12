import java.util.Scanner;

public class MicroProject {
    /*

    20. Micro project.

        Scenario: -

        There is one hotel owner who have to designee a menu for this hotel.

        Hotels have VEG, NOVEG section and Beverages.

        Each Veg, non-Veg section and Beverages have 3-3 items. (programmers-chose items as you wish).

        TASK: -

        Take user ordered as per user wish.

        There must be one option for no order.

        Remark for mini project.

        Try to make it fast executable.
    */


    public MicroProject() {
        int choice;
        Scanner scanner = new Scanner(System.in);



        do {
            System.out.println("Welcome to Java Restraunt :)!! Please select 0 for Veg and 1 for Non-Veg");
            choice = scanner.nextInt();
        }
        while (choice != 0 && choice != 1);


        if (choice==0) {System.out.println("Your Order Details: 1."+vegSection());}
        else {
            System.out.println("Your Order Details for Main Course: "+nonVegSection());}
        System.out.println("Your Order Details for Beverages: "+orderBeverages());


    }

    private static String orderBeverages() {
        Scanner scanner = new Scanner(System.in);
        String item ="";
        System.out.println("Welcome to Beverages Section! Please select your drink\n1.Lemon-Lime Mojito\n2.Fruit Punch\n3.Vanilla mocktail");

        int choice = scanner.nextInt();
        if (choice ==1){
            item = "Lemon-Lime Mojito";
        }
        if (choice ==2){
            item = "Fruit Punch";
        }
        if (choice ==3){
            item = "Vanilla mocktail";
        }
        return item;
    }

    private static String nonVegSection() {
        Scanner scanner = new Scanner(System.in);
        String item ="";
        System.out.println("Welcome to Non-Veg Section! Please select your drink\n1.Chicken Biriyani\n2.Chicken Kebab\n3.Chicken Tikka");

        int choice = scanner.nextInt();
        if (choice ==1){
            item = "Chicken Biriyani";
        }
        if (choice ==2){
            item = "Chicken Kebab";
        }
        if (choice ==3){
            item = "Chicken Tikka";
        }
        return item;


    }

    private static String vegSection() {


        Scanner scanner = new Scanner(System.in);
        String item ="";
        System.out.println("Welcome to Non-Veg Section! Please select your drink\n1.Paneer Biriyani\n2.Paneer Kebab\n3.Paneer Tikka");

        int choice = scanner.nextInt();
        if (choice ==1){
            item = "Paneer Biriyani";
        }
        if (choice ==2){
            item = "Paneer Kebab";
        }
        if (choice ==3){
            item = "Paneer Tikka";
        }
        return item;

    }
}
