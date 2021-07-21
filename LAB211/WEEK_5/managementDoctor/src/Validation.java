import java.util.ArrayList;
import java.util.Scanner;

public class Validation {
    private static final Scanner sc = new Scanner(System.in);
    public static int checkInputIntLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                //TODO: handle exception
                System.err.println("Enter number in range [ "+ min +", "+ max+" ]");
                System.out.print("Enter again: ");
            }
        }        
    }
    
    public static String checkInputString() {
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }

    // kiem tra xem code có tồn tại
    public static boolean checkCodeExist(ArrayList<Doctor> ld, String code) {
        for (Doctor doctor : ld) {
            if (doctor.getCode().equalsIgnoreCase(code)) {
                return false;
            }
        }
        return true;
    }

    //kiêm tra số int truyền vào
    public static int checkInputInt() {
        //loop until user input correct
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number integer");
                System.out.print("Enter again: ");
            }
        }
    }

    //kiem tra xem thông tin có bị dubplicate hay không
    public static boolean checkDuplicate(ArrayList<Doctor> ld, String code,
            String name, String specialization, int availability) {
        //check from first to last list doctor
        for (Doctor doctor : ld) {
            if (code.equalsIgnoreCase(doctor.getCode())
                    && name.equalsIgnoreCase(doctor.getName())
                    && specialization.equalsIgnoreCase(doctor.getSpecialization())
                    && availability == doctor.getAvailability()) {
                return false;
            }
        }
        return true;
    }

    //Kiểm tra xem thông tin co bị thay đổi hay không
    public static boolean checkChangeInfo(Doctor doctor, String code, String name, String specialization) {
        if (doctor.getCode().equalsIgnoreCase(code)
                &&doctor.getName().equalsIgnoreCase(name)
                &&doctor.getSpecialization()== specialization) {
            return false;
        }
        return true;
    }


}
