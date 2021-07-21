import java.util.Scanner;

public class Validation {
    
    private static final Scanner in = new Scanner(System.in);

    public static int checkIntLimit(int min, int max) {
        while (true) {
            try {
                int n = Integer.parseInt(in.nextLine());
                if (n < min || n > max) {
                    throw new NumberFormatException();
                }
                return n;
            } catch (NumberFormatException ex) {
                System.err.println("ENTER AGAIN!!");
                System.out.print("Enter in range ["+min +", "+ max +"]");
            }
        }
    }

    public static int checkInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine());
                return result;
            } catch (NumberFormatException ex) {
                System.err.println("ENTER AGAIN!!!");
                System.out.print("Enter integer: ");
            }
        }
    }





}
