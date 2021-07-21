import java.util.Scanner;

public class Validation {
    private final static Scanner sc = new Scanner(System.in);
    
    public static int checkInputIntLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                //TODO: handle exception
                System.err.println("Please enter number in range [ "+ min +","+max+ "]");
                System.out.print("Enter again: ");
            }
        }
    }

    public static double checkInputDouble() {
        while (true) {
            try {
                double result = Double.parseDouble(sc.nextLine().trim());
                return result;
            } catch (Exception e) {
                //TODO: handle exception
                System.err.println("Please enter double number.");
                System.out.print("Enter again: ");
            }
        }
    }

    public static String checkInputOperator() {
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Empty! Try again!");
            }else if(result.equalsIgnoreCase("+")||result.equalsIgnoreCase("-")
                    ||result.equalsIgnoreCase("*")||result.equalsIgnoreCase("/")
                    ||result.equalsIgnoreCase("^")||result.equalsIgnoreCase("=")){
                return result;
            } else{
                System.out.println("Must have +,-,*,/,^,= ");
            }
            System.out.print("Enter again: ");
        }
    }

    public static double checkInputDoubleBMI() {
        while (true) {
           try {
                double result = Double.parseDouble(sc.nextLine().trim());
                return result;
           } catch (NumberFormatException e) {
               //TODO: handle exception
               System.err.println("BMI is digit");
               System.out.print("Enter again: ");
           }            
        }
    }
}
