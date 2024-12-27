import java.util.Arrays;

public class InsertionSort1 {
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
        int[] arr = {2,7,4,1,4,8,9,4,2};
        System.out.println("Original Array:"+Arrays.toString(arr));
        sort(arr);
        System.out.println("After sorted:"+Arrays.toString(arr));
    }
}
