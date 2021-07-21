
import java.util.Scanner;

public class InputValidation {

    // declare
    Scanner sc = new Scanner(System.in);

    // check input option for menu in range
    public int validateMenuOption(int firstOption, int lastOption) {
        // declare
        int option;

        while (true) {
            try {
                option = Integer.parseInt(sc.nextLine().trim());
                if (option < firstOption || option > lastOption) {
                    throw new NumberFormatException();
                }
                return option;
            } catch (NumberFormatException e) {
                System.out.println("Option must between " + firstOption + " and " + lastOption);
                System.out.print("Your choice: ");
            }
        }
    }

    // check input double coefficients
    public double validateDouble() {
        // declare
        double inputDouble;

        while (true) {
            try {
                inputDouble = Double.parseDouble(sc.nextLine());
                return inputDouble;
            } catch (NumberFormatException e) {
                System.out.println("Please input number !!!");
                System.out.print("Enter again: ");
            }
        }
    }

    // check whether a number is odd or not
    public boolean isOdd(double inputNumber) {
        return inputNumber % 2 != 0;
    }

    // check whether a number is even or not
    public boolean isEven(double inputNumber) {
        return inputNumber % 2 == 0;
    }

    // check whether a number is square number or not
    public boolean isSquare(double inputNumber) {
        if (inputNumber == 0) {
        } else {
            return ((int) Math.sqrt(inputNumber) * (int) Math.sqrt(inputNumber) == inputNumber);
        }
        return false;
    }
}
