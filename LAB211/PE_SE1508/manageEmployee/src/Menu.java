public class Menu {
    
    public static int menu() {
        System.out.println("WELCOME TO EMPLOYEE MANAGEMENT");
        System.out.println("1. Create employee");
        System.out.println("2. View all employee information");
        System.out.println("3. View the employee's information has highest total salary");
        System.out.println("4. Exit");
        System.out.print("Please enter your choice: ");
        int choice = Validation.checkInputIntLimit(1, 4);
        System.out.println();
        return choice;
    }
}
