import java.util.ArrayList;

public class Manager {
    public static void createEmployee(ArrayList<Employee> employees) {
        while (true) {
            System.out.print("Choose 1 to create Lecture, 2 to create Officer: ");
            int type = Validation.checkInputIntLimit(1,2);
            System.out.print("Enter employee ID: ");
            String id = Validation.checkInputString();
            if(!Validation.checkIdExist(employees, id)){
                return;
            }
            System.out.print("Enter employee name: ");
            String name = Validation.checkInputString();
            System.out.print("Enter employee phone: ");
            String phone = Validation.checkInputPhone();
            System.out.print("Enter employee email: ");
            String email = Validation.checkInputEmail();
            System.out.print("Enter employee coefficients salary: ");
            float coefficient = Validation.checkInputFloat();
            Employee employee = new Employee(id, name, email, phone ,coefficient, type);
            switch (type) {
                case 1:
                    createLecturer(employees,employee);
                    break;
                case 2: 
                    createOffice(employees,employee);
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
    public static void createLecturer(ArrayList<Employee> employees, Employee employee) {
        System.out.print("Enter employee teaching hours allowance : ");
        float hourAllowance = Validation.checkInputFloat();
        employees.add(new Lecturer(employee.getId(), employee.getName(), employee.getEmail(), employee.getPhone(), 
                                                employee.getCoefficients(), employee.getEmployeeType(), hourAllowance));
        System.err.println("Create success.");
        
    }
    public static void createOffice(ArrayList<Employee> employees, Employee employee) {
        System.out.print("Enter employee department: ");
        String department = Validation.checkInputString();
        System.out.print("Enter employee office allowance: ");
        float officeAllowance = Validation.checkInputFloat();
        employees.add(new Officer(employee.getId(), employee.getName(), employee.getEmail(), employee.getPhone(), 
                                                employee.getCoefficients(), employee.getEmployeeType(), department, officeAllowance));
        System.err.println("Create success.");
        
    }


    public static void printEmployee(ArrayList<Employee> employees) {
        printLectures(employees);
        printOffice(employees);
    }


    public static void printLectures(ArrayList<Employee> employees) {
        System.out.println("============LECTURER============");
        for (Employee employee : employees) {
            if (employee instanceof Lecturer ) {
                Lecturer lecturer = (Lecturer)employee;
                System.out.printf("%-3s | %-15s | %-5s | %-5s | %-4.3f | %-4.3f\n",lecturer.getId(), lecturer.getName(), lecturer.getPhone(), 
                lecturer.getEmail(), lecturer.getCoefficients(), lecturer.getTeachingAllowance());                     
            }
        }
    }

    public static void printOffice(ArrayList<Employee> employees) {
        System.out.println("============OFFICER============");
        for (Employee employee : employees) {
            if (employee instanceof Officer) {
            Officer officer = (Officer)employee;
            System.out.printf("%-3s | %-15s| %-5s | %-5s | %-4.3f | %-3s | %-4.3f\n",officer.getId(), officer.getName(), officer.getPhone(), 
            officer.getEmail(), officer.getCoefficients(), officer.getDepartment(), officer.getOfficeAllowance()); 
            }
        }
    }


    public static void printHighestSalary(ArrayList<Employee> employees) {
        float max = employees.get(0).tinhLuong();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).tinhLuong() > max) {
                max = employees.get(i).tinhLuong();
            }
        }
        
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).tinhLuong() == max) {
                if (employees.get(i) instanceof Officer) {
                    Officer officer = (Officer)employees.get(i);
                    System.out.printf("%-3s | %-15s | %-5s | %-5s | %-4.3f | %-4.3f | %-4.3f\n",officer.getId(), officer.getName(), officer.getPhone(), 
                    officer.getEmail(), officer.getCoefficients(), officer.getOfficeAllowance(), max);                 
                } 
                if (employees.get(i) instanceof Lecturer) {
                    Lecturer lecturer = (Lecturer)employees.get(i);
                    System.out.printf("%-3s | %-15s | %-5s | %-5s | %-4.3f | %-4.3f | %-4.3f\n",lecturer.getId(), lecturer.getName(), lecturer.getPhone(), 
                    lecturer.getEmail(), lecturer.getCoefficients(), lecturer.getTeachingAllowance(), max); 
                }

            }
        } 
    }

}
