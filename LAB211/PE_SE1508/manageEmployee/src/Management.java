import java.util.ArrayList;

public class Management {
    
    public static void createEmployee(ArrayList<Employee> employees) {
        while (true) {
            System.out.print("Choose 1 to create Manager, 2 to create Staff: ");
            int type = Validation.checkInputIntLimit(1,2);
            System.out.print("Enter employee ID: ");
            String id = Validation.checkInputString();
            System.out.print("Enter employee name: ");
            String name = Validation.checkInputString();
            System.out.print("Enter employee birth year: ");
            int birthYear = Validation.checkInputIntLimit(1900, 2020);
            System.out.print("Enter employee email: ");
            String email = Validation.checkInputEmail();
            System.out.print("Enter employee coefficient salary: ");
            float coefficient = Validation.checkInputFloat();
            Employee employee = new Employee(id, name, email, birthYear,coefficient, type);
            switch (type) {
                case 1:
                    createManager(employees,employee);
                    break;
                case 2: 
                    createStaff(employees,employee);
                    break;
                default:
                    break;
            }
            System.out.print("Do you want to continue (Y/N): ");
            //check user want to create new candidate or not
            if (!Validation.checkInputYN()) {
                return;
            }

    }
        
}

    public static void createManager(ArrayList<Employee> employees, Employee employee) {
        System.out.print("Enter employee position coefficient: ");
        float coeffPosition = Validation.checkInputFloat();
        employees.add(new Manager(employee.getId(), employee.getName(), employee.getEmail(), employee.getBirthYear(), 
                                                employee.getCoefficients(), employee.getEmployeeType(), coeffPosition));
        System.err.println("Create success.");
    }

    public static void createStaff(ArrayList<Employee> employees, Employee employee) {
        System.out.print("Enter employee department: ");
        String department = Validation.checkInputString();
        employees.add(new Staff(employee.getId(), employee.getName(), employee.getEmail(), employee.getBirthYear(), 
                                                employee.getCoefficients(), employee.getEmployeeType(), department));
        System.err.println("Create success.");
    }

    public static void printEmployee(ArrayList<Employee> employees) {
        printManager(employees);
        printStaff(employees);
    }

    public static void printManager(ArrayList<Employee> employees) {
        System.out.println("============MANAGER============");
        for (Employee employee : employees) {
            if (employee instanceof Manager ) {
                Manager manager = (Manager)employee;
                // System.out.println(manager.getId() + " | " + manager.getName() + " | " + manager.getBirthYear() +" | " + manager.getEmail() +
                //                      " | " + manager.getCoefficients() + " | " + manager.getCoefficientPosition());
                System.out.printf("%-3s| %-10s| %-5s| %-15s| %-4.3f\n",manager.getId(), manager.getName(), manager.getBirthYear(), 
                manager.getEmail(), manager.getCoefficients(), manager.getCoefficientPosition());                     
            }
        }
    }

    public static void printStaff(ArrayList<Employee> employees) {
        System.out.println("============STAFF============");
        for (Employee employee : employees) {
            if (employee instanceof Staff) {
                // System.out.printf("%s", employee.getId(), employee.getName(), employee.getBirthYear(),
                //              employee.getEmail(), employee.getCoefficients());
                Staff staff = (Staff)employee;
                // System.out.println(staff.getId() + " | " + staff.getName()+ " | " + staff.getBirthYear() +" | " + staff.getEmail() +
                //                      " | " + staff.getCoefficients() + " | " + staff.getDepartment() );
                System.out.printf("%-3s| %-10s| %-5s| %-15s| %-4.3f\n",staff.getId(), staff.getName(), staff.getBirthYear(), 
                staff.getEmail(), staff.getCoefficients(), staff.getDepartment()); 
            }
        }
    }


    public static void printHighestSalary(ArrayList<Employee> employees) {
        float max = employees.get(0).tinhLuong();
        int index = 0;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).tinhLuong() > max) {
                max = employees.get(i).tinhLuong();
                index = i;
            }
        }
        if (employees.get(index) instanceof Staff) {
            // System.out.printf("%s", employee.getId(), employee.getName(), employee.getBirthYear(),
            //              employee.getEmail(), employee.getCoefficients());
            Staff staff = (Staff)employees.get(index);
            System.out.printf("%-3s| %-10s| %-5s| %-15s| %-4.3f | %-4.3f\n",staff.getId(), staff.getName(), staff.getBirthYear(), 
                                staff.getEmail(), staff.getCoefficients(), staff.getDepartment(), max);                 
        }
        if (employees.get(index) instanceof Manager) {
            // System.out.printf("%s", employee.getId(), employee.getName(), employee.getBirthYear(),
            //              employee.getEmail(), employee.getCoefficients());
            Manager manager = (Manager)employees.get(index);
                System.out.print(manager.getId() + " | " + manager.getBirthYear() +" | " + manager.getEmail() +
                                     " | " + manager.getCoefficients() + " | " + manager.getCoefficientPosition() +" | " );
                System.out.printf("%f\n" , max);
                // System.out.printf("5s%|20s%|6s%|20s%|5f%|5f%",manager.getId(), manager.getName(), manager.getBirthYear(), 
                //                         manager.getEmail(), manager.getCoefficients(), manager.getCoefficientPosition(), max);
                System.out.printf("%-3s| %-10s| %-5s| %-15s| %-4.3f | %-4.3f\n",manager.getId(), manager.getName(), manager.getBirthYear(), 
                manager.getEmail(), manager.getCoefficients(), manager.getCoefficientPosition(), max); 

        }
    }
}
