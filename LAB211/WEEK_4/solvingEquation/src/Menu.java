
import java.util.Scanner;
public class Menu {

    // declare
    Scanner sc = new Scanner(System.in);
    InputValidation iv = new InputValidation();

    // Main Menu
    public int mainMenu() {
        // declare
        int option;

        System.out.println("======== EQUATION PROGRAM ========");
        System.out.println("1. Calculate Superlative Equation");
        System.out.println("2. Calculate Quadratic Equation");
        System.out.println("3. Exit");
        System.out.print("Please choice one option: ");
        option = iv.validateMenuOption(1, 3);

        return option;
    }
}
