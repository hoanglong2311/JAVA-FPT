public class Menu {
    public static int menu() {
        System.out.println("=====Management Person programer=====");
        System.out.println("1. Input person information");
        System.out.println("2. Show 3 persons information by ascending of salary");
        System.out.println("3. Exit");
        int result = Validate.checkInputIntLimit(1, 3);
        return result;
    }
}
