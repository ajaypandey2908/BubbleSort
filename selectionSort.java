import java.util.Arrays;

public class selectionSort {
    public static void sort(int[] arr){

        int n =  arr.length;

        for(int i=0; i<n-1; i++){
            int minIndex = i;

            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp =  arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr =  {11,4,6,2,1,8,5,0,9};
        System.out.println("Original Array:"+Arrays.toString(arr));
        sort(arr);
        System.out.println("After sorting:"+Arrays.toString(arr));
    }
}
