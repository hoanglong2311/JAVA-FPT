public class Menu {

    public static int menu() {
        System.out.println("================== Format CSV Program ==================");
        System.out.println("1. Import CSV");
        System.out.println("2. Format Address");
        System.out.println("3. Format Name");
        System.out.println("4. Export CSV");
        System.out.println("5. Exit");
        System.out.print("Please choose one option: ");
        int result = Validation.checkInputIntLimit(1, 5);
        return result;
    }
    
}
