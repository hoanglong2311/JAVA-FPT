public class Main {
    public static void main(String[] args) throws Exception {
        while (true) {
            int choice = Menu.menu();
            switch (choice) {
                case 1:
                    Calculator.normalCalculator();
                    System.out.println();
                    break;
                case 2:
                    Calculator.calculateBMI();
                    System.out.println();
                    break;
                case 3:
                    return;    
            }

        }
    }
}
