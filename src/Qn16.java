public class Qn16 {
    //16. Write a program triangle star Pattern.

    public Qn16() {
        int rows = 10; // Change the number of rows as needed

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
