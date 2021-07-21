import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        HashMap<String, String> hm = new HashMap<>();

        while (true) {
            int choice = Menu.menu();
            switch (choice) {
                case 1:
                    Manager.addNewWord(hm);
                    break;
                case 2:
                    Manager.deleteWord(hm);
                    break;
                case 3:
                    Manager.translate(hm);
                    break;
                case 4:
                    return;
            }
        }
    }
}
