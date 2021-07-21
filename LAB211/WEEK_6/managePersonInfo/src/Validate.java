import java.util.Scanner;

public class Validate {
    
    private static final Scanner sc = new Scanner(System.in);
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

    public static String checkInputString() {
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }

    public static int checkInputSalary() {
        while (true) {
            
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < 0) {
                throw new NumberFormatException();
             }
            return result;
            } catch (NumberFormatException e) {
                //TODO: handle exception
                System.err.println("Salary must be greater than 0");
                System.out.print("Enter again: ");

            }
        }
    }

    private static int checkInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine());
                if (result <= 0) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException ex) {
                System.err.println("Input must be digit.");
            }
        }
    }

    public static int checkInputNumberPerson() {
        System.out.print("Enter number of person: ");
        int n = checkInputInt();
        return n;
    }

}
