
public class Menu {

    public static int menu() {
        System.out.println("======== Worker Management =========");
        System.out.println("    1. Add Worker");
        System.out.println("    2. Up salary");
        System.out.println("    3. Down salary");
        System.out.println("    4. Display Information salary");
        System.out.println("    5. Exit");
        System.out.println();
        System.out.println();
        System.out.print("Enter your choice: ");
        int choice = Validation.checkInputIntLimitInt(1, 5);
        return choice;
    }
}
