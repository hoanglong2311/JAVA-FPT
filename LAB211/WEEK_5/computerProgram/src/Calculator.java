
public class Calculator {
    public static double inputNumber() {
        System.out.print("Enter number: ");
        double number = Validation.checkInputDouble();
        return number;
    }

    public static void normalCalculator() {
        System.out.println("----- Normal Calculator -----");
        double memory;
        System.out.print("Enter number: ");
        memory = Validation.checkInputDouble();
        while (true) {
            System.out.print("Enter operator: ");
            String operator = Validation.checkInputOperator();
            if (operator.equalsIgnoreCase("+")) {
                memory += inputNumber();
                System.out.println("Memory: " + memory);
            }
            if (operator.equalsIgnoreCase("-")) {
                memory -= inputNumber();
                System.out.println("Memory: " + memory);
            }
            if (operator.equalsIgnoreCase("*")) {
                memory *= inputNumber();
                System.out.println("Memory: " + memory);
            }
            if (operator.equalsIgnoreCase("/")) {
                memory /= inputNumber();
                System.out.println("Memory: " + memory);
            }
            if (operator.equalsIgnoreCase("^")) {
                memory = Math.pow(memory, inputNumber());
                System.out.println("Memory: " + memory);
            }
            if (operator.equalsIgnoreCase("=")) {
                System.out.println("Result: " + memory);
                return;
            }
        }
    }

    public static String BMIstatus(double bmi) {
        if (bmi < 19) {
            return "Under-standard";
        } else if (bmi >= 19 && bmi < 25) {
            return "Standard";
        } else if (bmi >= 25 && bmi < 30) {
            return "Overweight";
        } else if (bmi >= 30 && bmi < 40) {
            return "Fat-should lose weight";
        } else {
            return "Very fat - should lose weight immediately";
        }      
    }

    public static void calculateBMI() {
        System.out.println("----- BMI Calculator -----");
        System.out.print("Enter Weight(kg): ");
        double weight = Validation.checkInputDoubleBMI();
        System.out.print("Enter Height(cm): ");
        double height = Validation.checkInputDoubleBMI();
        double bmi =(weight * 10000) / (height * height);
        System.out.printf("BMI number: %.2f\n", bmi);
        System.out.println("BMI Status: " + BMIstatus(bmi).toUpperCase());
    }

}
