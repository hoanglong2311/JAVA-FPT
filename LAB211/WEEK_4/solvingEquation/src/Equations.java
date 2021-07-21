
public class Equations {

    // declare
    // Scanner sc = new Scanner(System.in);
    InputValidation iv = new InputValidation();

    // Superlative Equation
    public void doSuperlativeEquation(double a, double b) {
        // declare
        double result;

        if (a == 0 && b == 0) {
            System.out.println("Infinity Result");
        } else if (a == 0 && b != 0) {
            System.out.println("None Result");
        } else {
            // calculate result
            result = -b / a;
            if (result == 0) {
                result = 0;
            }
            System.out.println("Solution: x = " + result);

            // display Odd number
            System.out.print("Odd Number(s): ");
            if (iv.isOdd(a)) {
                System.out.print(a + " ");
            }
            if (iv.isOdd(b)) {
                System.out.print(b + " ");
            }
            if (iv.isOdd(result)) {
                System.out.print(result + " ");
            }
            System.out.println();

            // display Even number
            System.out.print("Number is Even: ");
            if (iv.isEven(a)) {
                System.out.print(a + " ");
            }
            if (iv.isEven(b)) {
                System.out.print(b + " ");
            }
            if (iv.isEven(result)) {
                System.out.print(result + " ");
            }
            System.out.println();

            // display Square number
            System.out.print("Number is Perfect Square: ");
            if (iv.isSquare(a)) {
                System.out.print(a + " ");
            }
            if (iv.isSquare(b)) {
                System.out.print(b + " ");
            }
            if (iv.isSquare(result)) {
                System.out.print(result + " ");
            }
            System.out.println();
        }
    }

    // Quadratic Equation
    public void doQuadraticEquation(double a, double b, double c) {
        // declare
        double delta;
        double result_1 = 0;
        double result_2 = 0;

        if (a == 0 && b == 0 && c == 0) {
            System.out.println("Infinity Result");
        } else if (a == 0 && b != 0) {
            doSuperlativeEquation(b, c);
        } else {
            // calculate delta
            delta = (b * b - 4 * a * c);
            if (delta < 0) {
                System.out.println("None result");
            } else if (delta == 0) {
                if (a == 0) {
                    System.out.println("None result");
                } else {
                    // calculate results
                    result_1 = (-b) / (2 * a);
                    result_2 = result_1;
                    System.out.println("Solutions: x1 = x2 = " + result_1);
                }
            } else {
                // calculate results
                result_1 = (-b + Math.sqrt(delta)) / (2 * a);
                result_2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Solutions: x1 = " + result_1 + ", x2 = " + result_2);
            }

            // display Odd number
            System.out.print("Number is Odd: ");
            if (iv.isOdd(a)) {
                System.out.print(a + " ");
            }
            if (iv.isOdd(b)) {
                System.out.print(b + " ");
            }
            if (iv.isOdd(c)) {
                System.out.print(c + " ");
            }
            if (iv.isOdd(result_1)) {
                System.out.print(result_1 + " ");
            }
            if (iv.isOdd(result_2)) {
                System.out.print(result_2 + " ");
            }
            System.out.println();

            // display Even number
            System.out.print("Number is even: ");
            if (iv.isEven(a)) {
                System.out.print(a + " ");
            }
            if (iv.isEven(b)) {
                System.out.print(b + " ");
            }
            if (iv.isEven(c)) {
                System.out.print(c + " ");
            }
            if (iv.isEven(result_1)) {
                System.out.print(result_1 + " ");
            }
            if (iv.isEven(result_2)) {
                System.out.print(result_2 + " ");
            }
            System.out.println();

            // display Square number
            System.out.print("Number is Perfect Square: ");
            if (iv.isSquare(a)) {
                System.out.print(a + " ");
            }
            if (iv.isSquare(b)) {
                System.out.print(b + " ");
            }
            if (iv.isSquare(c)) {
                System.out.print(c + " ");
            }
            if (iv.isSquare(result_1)) {
                System.out.print(result_1 + " ");
            }
            if (iv.isSquare(result_2)) {
                System.out.print(result_2 + " ");
            }
            System.out.println();
        }
    }
}
