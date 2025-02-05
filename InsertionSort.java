import java.util.Arrays;

public class InsertionSort {
    public static void sort(int[] arr){

        int n = arr.length;

        for(int i=1; i<n; i++){
            int key = arr[i];
            int j = i-1;

            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args) {
        int[] arr = {8,4,2,9,5,2,7,0};
        System.out.println("Original Array:"+Arrays.toString(arr));
        sort(arr);
        System.out.println("After Sorted:"+Arrays.toString(arr));
    }
}
