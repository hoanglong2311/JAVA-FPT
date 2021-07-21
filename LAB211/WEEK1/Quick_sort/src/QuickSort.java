public class QuickSort {
    public void displayArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    
    int partition(int arr[], int left, int right) {
        int pivot = arr[right];
        int i = (left - 1); //index of smaller element
        for (int j = left; j < right; j++) {
            //nếu phần tử hiện tại nhỏ hơn chốt
            if (arr[j] < pivot) {
                i++;

                //swap arr[i] vaf arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
       
        //swap arr[i+1] vaf arr[right] (hoac pivot)
       int temp = arr[i+1];
       arr[i+1] = arr[right];
       arr[right] = temp;
       
       return i + 1; 
    }

    void quickSort(int arr[], int left, int right) {
        if (left < right) {

            //pi la chi muc cua hot, arr[pi] vi tri cua chott
            int pi = partition(arr, left, right);

            //sắp xếp đệ quy các phần tử
            //trước phân vùng và sau phân vùng
            quickSort(arr, left, pi- 1);
            quickSort(arr, pi+1, right);
        }
    }
}
