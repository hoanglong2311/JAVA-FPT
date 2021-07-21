public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.err.println("====== Validate Progaram ======");
        System.out.print("Phone number: ");
        String phone = Validate.checkInputPhone();
        System.out.print("Email: ");
        String email = Validate.checkInputEmail();
        System.out.print("Date: ");
        String date = Validate.checkInputDate();  
    }
}
