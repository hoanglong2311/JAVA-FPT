import java.util.Locale;

public class Menu {
    public static int menu() {
        Locale english = Locale.ENGLISH;
        System.out.println("-------Login Program-------");
        System.out.println("1. Vietnamese");
        System.out.println("2. English");
        System.out.println("3. Exit");
        System.out.print("Please choice one option: ");
        int choice = Validation.checkInputIntLimit(1, 3, english);
        return choice;
    }
}
