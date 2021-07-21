
import java.util.Random;
import java.util.Scanner;

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
