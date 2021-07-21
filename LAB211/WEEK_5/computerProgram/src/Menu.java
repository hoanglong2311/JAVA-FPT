public class Menu {
    public static int menu() {
        System.out.println("========= Calculator Program =========");
        System.out.println("1. Normal Calculator");
        System.out.println("2. BMI Calculator");
        System.out.println("3. Exit");
        System.out.print("Please choice one option: ");
        int choice = Validation.checkInputIntLimit(1, 3);
        return choice;
    }
}
