import java.lang.Math;
import java.util.Scanner;
public class Main{
    
    static int search(int n, int[] arr, int m){
        for (int i = 0; i<arr.length; i++){
            if (m==arr[i]) return i; 
        }
        return -1;
    }
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of array: ");
        
        int n = sc.nextInt();
        int[] arr = new int [n];
        int random_int = 0;
        
        System.out.print("The array: [");
        for (int i=0; i<n; i++){
            random_int = (int)(Math.random() * (10 + 1));
            arr[i] = random_int;
        }
        for (int i=0; i<arr.length-1; i++) System.out.print(arr[i]+ ", ");
        System.out.println(arr[arr.length-1]+ "]");//in gia tri cuoi cung kem theo dau ]
        
        System.out.print("Enter search value: ");
        int m=sc.nextInt();
        System.out.println("Found "+ m + " at index: " + search(n, arr, m));
        sc.close();
    }
}