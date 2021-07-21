
public class Menu {
    
    public static int menu() {
        System.out.println("========= Contact program =========");
        System.out.println(" 1. Add a Contact");
        System.out.println(" 2. Display all Contact");
        System.out.println(" 3. Delete a Contact");
        System.out.println(" 4. Exit");
        int choice = Validation.checkInputIntLimit(1, 4);
        return choice;
    }
}
