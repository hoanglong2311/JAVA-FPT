import java.util.ArrayList;
import java.util.Scanner;

public class Validation {
     private static Scanner sc = new Scanner(System.in);
    public static int checkInputIntLimitInt(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < min || result > max) {
                    throw  new NumberFormatException();
                }
                return result;
            } catch (Exception e) {
                //TODO: handle exception
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }

    public static boolean checkIdExist(ArrayList<Worker> lw, String id) {
        //check from first to last list id worker exist or not
        for (Worker worker : lw) {
            if (id.equalsIgnoreCase(worker.getId())) {
                return false;
            }
        }
        return true;
    }


    public static String checkInputString() {
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Cannot be null!");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }

    public static int checkInputSalary() {
        while (true) {
            
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < 0) {
                throw new NumberFormatException();
             }
            return result;
            } catch (NumberFormatException e) {
                //TODO: handle exception
                System.err.println("Salary must be greater than 0");
                System.out.print("Enter again: ");

            }
        }
    }

    public static boolean checkWorkerExist(ArrayList<Worker> lw, String id, String name,int age, int salary, String location) {
        for (Worker worker : lw) {
            if (id.equalsIgnoreCase(worker.getId())
                    && name.equalsIgnoreCase(worker.getName())
                    && age == worker.getAge()
                    && salary == worker.getSalary()) {
                return false;
            }
        }
        return true;
    }



}
