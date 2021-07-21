import java.util.Locale;
import java.util.Scanner;

public class Validation {
    
    private static final Scanner in = new Scanner(System.in);
    private static final String ACCOUNT_NUMBER_VALID = "^\\d{10}$";

    
    public static int checkInputIntLimit(int min, int max, Locale language) {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException ex) {
                Login.getWordLanguage(language, "errorCheckInputIntLimit");
                System.out.print("Enter again: ");
            }
        }
    }

    public static String checkInputString(Locale language) {
        while (true) {
            String result = in.nextLine();
            if (result.length() == 0) {
                Login.getWordLanguage(language, "errCheckInputString ");
            } else {
                return result;
            }
        }
    }

    public static int checkInputAccount(Locale language) {
        while (true) {
            String result = in.nextLine();
            if (result.matches(ACCOUNT_NUMBER_VALID)) {
                return Integer.parseInt(result);
            }
            Login.getWordLanguage(language, "errCheckInputAccount");
            System.out.println();
            Login.getWordLanguage(language, "enterAccountNumber");
        }
    }

    //check password
    public static String checkInputPassword(Locale language) {
        String result;
        while (true) {
            result = checkInputString(language);
            if (isValidPassword(result, language)) {
                return result;
            }
        }
    }

    //Check input password
    public static boolean isValidPassword(String password, Locale language) {
        int length = password.length();
        if (length < 8 || length > 31) {
            Login.getWordLanguage(language, "errCheckLengthPassword");
            System.out.println();
            Login.getWordLanguage(language, "enterPassword");
            return false;
        } else {
            int countDigits = 0;
            int countLetters = 0;
            for (int i = 0; i < length; i++) {
                if (Character.isDigit(password.charAt(i))) {
                    countDigits++;
                }
                if (Character.isLetter(password.charAt(i))) {
                    countLetters++;
                }
            }
            if (countDigits < 1 || countLetters < 1) {
                Login.getWordLanguage(language, "errCheckAlphanumericPassword");
                System.out.println();
                Login.getWordLanguage(language, "enterPassword");
                return false;
            }
        }
        return true;
    }


    public static boolean checkInputCaptcha(String captchaGenerated, Locale language) {
        System.out.println("Captcha: "+ captchaGenerated);
        Login.getWordLanguage(language, "enterCaptcha");
        String captchaInput = checkInputString(language);
        for (int i = 0; i < captchaInput.length(); i++) {
            if (!captchaGenerated.contains(Character.toString(captchaInput.charAt(i)))) {
                return false;
            }
        }
        return true;
    }


}
