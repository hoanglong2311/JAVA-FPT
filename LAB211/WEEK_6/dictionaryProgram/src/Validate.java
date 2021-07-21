import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Validate {
    private static final Scanner sc= new Scanner(System.in);

    public static int checkInputIntLimit(int min, int max) {
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

    public static boolean checkInputYN() {
        System.out.print("Do you want to replace(Y/N)? ");
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("Y")) {
                return true;
            }
            if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Please input y/Y or n/N.");
            System.out.print("Enter again: ");
        }
    }

    public static boolean checkKeywordExist(HashMap<String, String> hm, String english) {
        Set<Map.Entry<String, String>> set = hm.entrySet(); // trả về các 
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> mEntry = (Map.Entry<String, String>) iterator.next();
            if (english.equalsIgnoreCase(mEntry.getKey().toString())) {
                return false;
            }
        }
        return true;
    }


}
