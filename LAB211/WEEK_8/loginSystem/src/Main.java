import java.util.Locale;

public class Main {
    public static void main(String[] args) throws Exception {
        Locale vietnamese = new Locale("vi");
        Locale english = Locale.ENGLISH;
        int choice = Menu.menu();
        switch (choice) {
            case 1:
                Login.login(vietnamese);
                break;
            case 2:
                Login.login(english);
                break;
            case 3:
                return;
        }
    }
}
