import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        //them du lieu
        employees.add(new Lecturer("L1", "Long","0123456789","long@fpt.edu.vn",  (float) 2, 1, (float) 1500000));
        employees.add(new Lecturer("L2", "Long Long","0123456789", "long@fpt.edu.vn",  (float) 3, 1, (float) 1600000));
        employees.add(new Lecturer("L3", "Long Long Long","0123456789", "long@fpt.edu.vn",  (float) 3.33, 1, (float) 15000000));
        employees.add(new Lecturer("L4", "Nhatg","0123456789", "long@fpt.edu.vn",  (float) 3.33, 1, (float) 15000000));
        // employees.add(new Lecturer("L5", "Nhatg","0123456789", "long@fpt.edu.vn",  (float) 4, 1, (float) 15000000));
        //them du lieu
        employees.add(new Officer("O1", "Dang Huu Quang","0123456789","long@fpt.edu.vn",   (float) 1.2, 1, "IT", (float) 500000));
        employees.add(new Officer("O2", "Ba Hau","0123456789","long@fpt.edu.vn",   (float) 1.3, 1, "IT", (float) 600000));
        employees.add(new Officer("O3", "Thuy Men","0123456789","long@fpt.edu.vn",   (float) 2, 1, "SA", (float) 1000000));
        employees.add(new Officer("O4", "Nobita","0123456789", "long@fpt.edu.vn",  (float) 3.33,1,"SA",  (float) 15000000));
        while (true) {
            int choice = Menu.menu();
            switch (choice) {
                case 1:
                    Manager.createEmployee(employees);
                    System.out.println();
                    break;
                case 2:
                    Manager.printEmployee(employees);
                    System.out.println();
                    break;
                case 3:
                    Manager.printHighestSalary(employees);
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
