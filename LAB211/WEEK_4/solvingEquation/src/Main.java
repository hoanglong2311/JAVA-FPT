
public class Main {

    public static void main(String[] args) {
        // declare
        int option;
        Menu mn = new Menu();
        InputValidation iv = new InputValidation();
        Equations eq = new Equations();
        double a;
        double b;
        double c;

        // Main Menu
        while (true) {
            option = mn.mainMenu();
            switch (option) {
                case 1:
                    // input coefficients
                    System.out.println("---- Calculate Equation -----");
                    System.out.print("Enter A: ");
                    a = iv.validateDouble();
                    System.out.print("Enter B: ");
                    b = iv.validateDouble();
                    eq.doSuperlativeEquation(a, b);
                    break;
                case 2:
                    // input coefficients
                    System.out.println("----- Calculate Quadratic Equation -----");
                    System.out.print("Enter A: ");
                    a = iv.validateDouble();
                    System.out.print("Enter B: ");
                    b = iv.validateDouble();
                    System.out.print("Enter C: ");
                    c = iv.validateDouble();
                    eq.doQuadraticEquation(a, b, c);
                    break;
                case 3:
                    return;
            }
        }
    }
}
