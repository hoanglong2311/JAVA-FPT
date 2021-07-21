public class Menu {
    public static int  menu() {
        System.out.println("\n========= Task program =========");
        System.out.println("1. Add Task");
        System.out.println("2. Delete Task");
        System.out.println("3. Display Task");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = Validate.checkIntLimit(1, 4);
        return choice;
    }
}
