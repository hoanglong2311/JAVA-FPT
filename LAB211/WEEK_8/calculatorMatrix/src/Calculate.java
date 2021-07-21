public class Calculate {
    

    public static int[][] inputMatrix(int n) {
        System.out.println("----------Enter input matrix----------");
        //nhập vào các giá trị về số hàng và cột
        System.out.print("Enter Row Matrix " + n + ": ");
        int row = Validation.checkInputInt();
        System.out.print("Enter Colum Matrix " + n + ": ");
        int col = Validation.checkInputInt();
        //khai báo ma 
        // int[][] matrixex= new int[3][4];
        int[][] matrix = new int[row][col];
        //thực hiện phép nhập vào cho từng phần tử ma trận
        for (int i = 0; i < row; i++) {
            for (int j  = 0; j < col; j++) {
                System.out.print("Enter Matrix" + n + "[" + (i+1) + "]" + "[" + (j+1) + "]:");
                matrix[i][j] = Validation.checkInputInt();
            }
        }
        return matrix;
    }

    public static void displayMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        //thực hiện việc in ra ma trận
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println();
        }
    }

    public static void additionMatrix(int[][] matrix1, int[][] matrix2) {
        System.out.println("---------- Addition ----------");
        displayMatrix(matrix1);
        System.out.println("+");
        displayMatrix(matrix2);
        System.out.println("=");

        int row = matrix1.length;
        int col = matrix1[0].length;
        //thực hiện phép cộng ma trận
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("[" + matrix1[i][j] + matrix1[i][j] + "]");
            }
            System.out.println();
        }
    }


    public static void subtractionMatrix(int[][] matrix1, int[][] matrix2) {
        System.out.println("---------- Subtraction ----------");
        displayMatrix(matrix1);
        System.out.println("-");
        displayMatrix(matrix2);
        System.out.println("=");

        int row = matrix1.length;
        int col = matrix1[0].length;

        //Thực hiện phép trừ ma trận
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("[" + (matrix1[i][j] - matrix2[i][j]) + "]");
            }
            System.out.println();
        }
    }



    public static void multiplicationMatrix(int[][] matrix1, int[][] matrix2) {
        System.out.println("---------- Multiplication ----------");
        displayMatrix(matrix1);
        System.out.println("*");
        displayMatrix(matrix2);
        System.out.println("=");

        int row1 = matrix1.length;
        int col1 = matrix1[0].length;
        int row2 = matrix2.length;
        int col2 = matrix2[0].length;

        //Kiểm tra xem ma trận có nhân được hay không
        if (col1 == row2) {
            int[][] matrixResult = new int[row1][col2];
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    matrixResult[i][j] = 0;
                }
            }

            //tính phép nhân ma trận
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    for (int k = 0; k < col1; k++) {
                        matrixResult[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
            //in ra kết quả của phép nhân ma trận
            displayMatrix(matrixResult);
        }

        if (col1 != row2) {
            System.err.println("Can't multiple");
            System.err.println("Please enter again!!");
            int[][] matrixEX1 = inputMatrix(1);
            int[][] matrixEX2 = inputMatrix(2);
            multiplicationMatrix(matrixEX1, matrixEX2);
        }


        
    }





}
