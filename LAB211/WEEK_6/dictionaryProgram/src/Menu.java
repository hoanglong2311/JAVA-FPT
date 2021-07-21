
public class Menu {
   
    public static int menu() {
        System.out.println("======== Dictionary program ========");
        System.out.println("1. Add Word");
        System.out.println("2. Delete Word");
        System.out.println("3. Translate");
        System.out.println("4. Exit");
        int choice = Validate.checkInputIntLimit(1,4);
        return choice;
    }
}
