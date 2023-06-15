import java.util.HashMap;

public class Two_sum {

    /*
    * Use 2 loops for brute force
    * Sorting the Array
    * Using HashMap
    * If there are duplicates in the array use list
    */
    public static void findPair(int[] nums, int target){

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(target - nums[i])){
                System.out.printf("Pair found (%d, %d)", nums[map.get(target - nums[i])], nums[i]);
            }else {
                map.put(nums[i], i);
            }
        }
    }

    public static void main(String[] args){
        int[] nums = { 8, 7, 2, 5, 3, 5, 1 };
        int target = 10;
        findPair(nums, target);
    }
}
