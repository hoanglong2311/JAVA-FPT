import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        
        while (true) {
            int choice = Menu.menu();
            switch (choice) {
                case 1:
                    Management.createEmployee(employees);
                    System.out.println();
                    break;
                case 2:
                    Management.printEmployee(employees);
                    System.out.println();
                    break;
                case 3:
                    Management.printHighestSalary(employees);
                    System.out.println();
                    break;
                case 4:
                    return;
                default:
                    break;
            }
        }

    }
}
