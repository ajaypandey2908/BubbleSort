import java.util.Arrays;

public class BubbleSort {
    public static void sort(int[] arr){
        int n = arr.length;

        for(int i=0; i<n-1; i++){
            boolean swap = false;

            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
    
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
        }
    }
    public static void main(String[] args) {
         int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Unsorted Array: " + Arrays.toString(arr));

        sort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
