import java.util.Scanner;

public class Validate {

    private static final Scanner in = new Scanner(System.in);
    private static final String PHONE_VALID = "^\\d{10}$";
    private static final String EMAIL_VALID = "^[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}$";
    private static final String DATE_VALID = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";


    public static String checkInputPhone() {
        while (true) {
            try {
                // int phoneCheck = Integer.parseInt(in.nextLine());
                // String result = String.valueOf(phoneCheck);

                String result = checkInputString();
                if (!result.matches(PHONE_VALID)) {
                    System.err.println("Phone number must be 10 digits");
                } else {
                    return result;
                }
            } catch (NumberFormatException e) {
                //TODO: handle exception
                System.err.println("Phone number must be number");
                System.out.print("Phone number: ");
            }
            
        }
    }


    public static String checkInputString() {
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("It can be empty!");
            } else {
                return result;
            }
        }
    }

    public static String checkInputEmail() {
        while (true) {
            String emailCheck = checkInputString();
            if (!emailCheck.matches(EMAIL_VALID)) {
                System.err.println("Email must be correct format");
                System.out.print("Email: ");
            } else {
                return emailCheck;
            }
        }
    }


    public static String checkInputDate() {
        while (true) {
            try {
                String dateCheck = checkInputString();
                if (!dateCheck.matches(DATE_VALID)) {
                    System.err.println("Invalid Date");
                } else {
                    return dateCheck;
                }
            } catch (Exception e) {
                //TODO: handle exception
                System.err.println("Date to correct format(dd/MM/yyyy)");
                System.out.print("Date: ");
            }
           
        }
    }

}
