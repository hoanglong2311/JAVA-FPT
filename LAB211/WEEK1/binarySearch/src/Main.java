package binarySearch;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter number of array: ");
       int length = scanner.nextInt();
       
       System.out.println("Enter search value:");
       int search = scanner.nextInt();

       int[] arr = new int[length];
       for (int i = 0; i < length; i++) {
           arr[i] = new Random().nextInt(length);
       }
      

       BubbleSort sorter = new BubbleSort();
       BinarySearch searcher = new BinarySearch();

       System.out.print("Unsorted array: ");
       sorter.displayArray(arr);

       System.out.println();

       //Use bubble sort to sort array
       sorter.bubbleSort(arr);
       System.out.print("Sorted array: ");
       sorter.displayArray(arr);


       System.out.println();

       
       

       int foundIndex = searcher.binarySearch(arr, search, 0, length - 1);
        System.out.println("\nFound " + search + " at index: " + foundIndex);
       if (foundIndex == -1) {
           System.out.println("Can't find! Try again! ");
       }
       scanner.close();
    }
}
