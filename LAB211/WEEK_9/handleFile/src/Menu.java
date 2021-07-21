
public class Menu {
    
    public static int menu() {
        System.out.println("================== File Processing ==================");
        System.out.println("1. Check Path");
        System.out.println("2. Get file name with type java");
        System.out.println("3. Get file with size greater than input");
        System.out.println("4. Write more content to the file");
        System.out.println("5. Read file and count characters");
        System.out.println("6. Exit");
        System.out.print("Please choose one option: ");
        int result = Validation.checkInputIntLimit(1, 6);
        return result;
    }
    
}
