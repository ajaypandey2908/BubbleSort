
import java.util.HashMap;

public class twoSum1 {
    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int neededNumber = target- nums[i];

            if(map.containsKey(neededNumber)){
                return new int[] {map.get(neededNumber),i};
            }
            map.put(nums[i], i);
        }
        return new int[]  {};
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int target =  17;
        int[] result = twoSum(nums, target);
        System.out.println("Indices is: "+result[0]+" , "+result[1]);
    }
}
