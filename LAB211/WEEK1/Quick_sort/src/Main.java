import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of array: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < array.length;i++){
            array[i] = new Random().nextInt(length);
        }

        QuickSort sort = new QuickSort();

        System.out.println("Unsorted array: ");
        sort.displayArray(array);

        System.out.println();

        sort.quickSort(array, 0, length-1);
        System.out.println("Sorted array: ");
        sort.displayArray(array);
        
    }
}
