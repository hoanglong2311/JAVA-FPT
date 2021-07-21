import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Validation {
    

    private final static Scanner in = new Scanner(System.in);

    public static int checkInputIntLimit(int min , int max) {
        //Lặp đến khi người dùng nhập vào đung
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();


                }

                return result;
            }   catch (NumberFormatException e){
                System.err.println("Please input number in range [" + min + "," + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }

    public static String checkInputString() {
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            } 
        }
        
    }

    private static final String PHONE_NUMBER_VALID = "^\\d{10}\\d*$";

    public static String checkInputPhone() {
        while (true) {
            String result = checkInputString();
            if (result.matches(PHONE_NUMBER_VALID)) {
                return result;
            } else {
                System.err.println("Phone number is with miniu 10 character");
                System.out.print("Enter again: ");
            }
        }
    }

    private static final String EMAIL_VALID = "^[A-Za-z0-9.+-_%]+@[A-Za-z.-]+\\.[A-Za-z]{2,4}$";

    public static String checkInputEmail() {
        while (true) {
            String result = checkInputString();

            if (result.matches(EMAIL_VALID)) {
                return result;
            } else {
                System.err.println("Email is not available");
                System.out.println("Your email should have format  <account name>@<domain> ");
                System.out.print("Enter again: ");
            }
        }
    }


    public static boolean checkIdExists(ArrayList<Candidate> candidates, String id) {
        for (Candidate candidate : candidates) {
            if (candidate.getId().equalsIgnoreCase(id)) {
                System.err.println("Id exists. ");
                return false;
            }
        }
        return true;
    }

    public static int  checkInputExprience(int birthDate) {
        int  yearCurrent = Calendar.getInstance().get(Calendar.YEAR);
        int age = yearCurrent - birthDate;
        while (true) {
            int yearExperience = checkInputIntLimit(1, 100);
            if (yearExperience > age) {
                    System.out.println("Experience must be smaller than your age ");
                } else {
                    return yearExperience;
                }
            }
    }

    public static String checkInputGraduationRank() {
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("Excellence")| 
                    result.equalsIgnoreCase("Good")||
                    result.equalsIgnoreCase("Fair")||
                    result.equalsIgnoreCase("Poor")) {
                return result;
            } else {
                System.err.println("Please enter right rank (Excellence, Good, Fair, Poor)");
                System.out.print("Enter again: ");
            }
        }
    }

    public static boolean checkInputYN() {
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("Y")) {
                return true;
            } else if (result.equalsIgnoreCase("N"))
                return false;
            System.err.println("Please input y/Y or n/N.");
            System.out.print("Enter again: ");    
        }
    }

    
}
