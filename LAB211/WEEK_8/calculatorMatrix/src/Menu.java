public class Menu {
    public static int menu() {
        System.out.println("========Calculator program========");
        System.out.println("1. Addition Matrix");
        System.out.println("2. Subtraction Matrix");
        System.out.println("3. Multiplication Matrix");
        System.out.println("4. Quit");
        System.out.print("Enter your choice: ");
        int choice = Validation.checkIntLimit(1, 4);
        return choice;
    }
}
