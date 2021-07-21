public class Menu {
    public static int menu() {
        System.out.println("========= Doctor Management ==========");
        System.out.println("    1. Add Doctor");
        System.out.println("    2. Update Doctor");
        System.out.println("    3. Delete Doctor");
        System.out.println("    4. Search Doctor");
        System.out.println("    5. Exit");
        System.out.print("Enter your choice: ");
        int choice = Validation.checkInputIntLimit(1, 5);
        return choice;
    }
}
