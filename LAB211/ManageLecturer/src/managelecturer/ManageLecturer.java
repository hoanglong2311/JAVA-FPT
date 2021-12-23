
package managelecturer;

public class ManageLecturer {

    static int menu(){
        System.out.println();
        System.out.println("WELCOME TO EMPLOYEE MANAGEMENT");
        System.out.println("1. Create employee");
        System.out.println("2. View all employee information");
        System.out.println("3. View the employee's information has highest total salary");
        System.out.println("4. Exit");
        System.out.println();
        return Validation.inputIntInRange(1, 4,"Please enter your choice:");
    }
    public static void main(String[] args) {
        int choice;
        Manager manager =new Manager();
        do {            
            choice=menu();
            switch (choice){
                case 1:
                    manager.create();
                    System.out.println();
                    break;
                case 2:
                    manager.printLectures();
                    System.out.println();
                    break;
                case 3:
                    manager.printHighestSalary();
                    System.out.println();
                    break;
                default:
                    return;
            }
        } while (true);
    }
    
}
