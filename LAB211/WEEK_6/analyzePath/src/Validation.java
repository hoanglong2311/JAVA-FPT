import java.util.Scanner;

public class Validation {
    private static final Scanner sc= new Scanner(System.in);
    private static final String VALID_PATH = "^(?:[\\w]\\:|\\\\)(\\\\[\\w_\\-\\s0-9\\.]+)+\\.(txt|gif|pdf|doc|docx|xls|xlsx|apk)$";
    // "[A-Za-z]:[A-Za-z0-9\\s\\!\\@\\#\\$\\%\\^\\&\\(\\)\\'\\;\\{\\}\\[\\]\\=\\+\\-\\_\\~\\`\\.\\\\]+"
    public static String checkValidPath() {
        while (true) {
            String result = sc.nextLine().trim();
            if (result.length() == 0) {
                System.err.println("Path is empty!");
                System.out.print("Enter again: ");
            } else if(!result.matches(VALID_PATH)) {
                System.err.println("It is not a  valid path!");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }
}
