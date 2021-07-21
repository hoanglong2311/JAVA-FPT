
import java.util.Scanner;

public class Menu {

    // declare
    Scanner sc = new Scanner(System.in);
    InputValidation iv = new InputValidation();

    // main menu
    public int mainMenu() {
        System.out.println("Candidate Management System");
        System.out.println("1. Experience");
        System.out.println("2. Fresher");
        System.out.println("3. Internship");
        System.out.println("4. Searching");         
        System.out.println("5. Exit");
        System.out.println("Please choose 1 to Create Experience Candidate, 2 to Create Fresher Candidate, 3 to Internship Candidate,4 to Searching and 5 to Exit program.");
        System.out.print("Your choice: ");
        int option = iv.validateMenuOption(1, 5);

        return option;
    }
}
