package binarySearch;

import java.util.Random;
import java.util.Scanner;

public class BinarySearch {
    
    public class BubbleSort {


        public void displayArray(int[] arr) {
            System.out.print("[");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
                if (i < arr.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("]");
        }
    
        
    
        public void bubbleSort(int[] arr) {
            boolean haveSwap = false;
            for (int i = 0; i < arr.length-1; i++){
                haveSwap = false;
                for (int j = 0; j < arr.length-i-1; j++){
                    if (arr[j] > arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr [j+1];
                        arr[j+1] =temp;
                        haveSwap = true; 
                    }
                }
                //if dont have any swapped, so array was sorted. Stop
                if(haveSwap == false){
                    break;
                }
            }
    
           
        }
    }
    
    
    


    int binarySearch(int[] array, int value, int left, int right) {
        if (left > right) {
            return -1;
        }
        int middle = (left + right) / 2;
        if (array[middle] == value) {
            return middle;
        } else if (array[middle] > value) {
            return binarySearch(array, value, left, middle - 1);
        } else {
            return binarySearch(array, value, middle + 1, right);
        }
    }
}
