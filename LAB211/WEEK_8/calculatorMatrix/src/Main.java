public class Main {
    public static void main(String[] args) throws Exception {

        int[][] matrix1 = Calculate.inputMatrix(1);
        int[][] matrix2 = Calculate.inputMatrix(2);

        while (true) {
            int choice = Menu.menu();
            System.out.println();
            switch (choice) {
                case 1:
                    System.out.println("----------Result----------");
                    Calculate.additionMatrix(matrix1, matrix2);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("----------Result----------");
                    Calculate.subtractionMatrix(matrix1, matrix2);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("----------Result----------");
                    Calculate.multiplicationMatrix(matrix1, matrix2);
                    System.out.println();
                    break;
                case 4:
                    return;
            }
        }
    }
}
