package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6};
        int target = 10;
        System.out.println(Arrays.toString(twoSums(arr, target)));
        System.out.println(Arrays.toString(twoSumSet(arr, target)));
        System.out.println(Arrays.toString(twoSumOptimised(arr, target)));

    }

        public static int[] twoSums(int[] nums, int target) {
            int[] res = new int[2];

            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        res[0] = i;
                        res[1] = j;
                        break;
                    }
                }
            }
            return res;
        }

    public static int[] twoSumSet(int[] nums, int target) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i]+nums[j] == target){
                    set.add(i);
                    set.add(j);
                }
            }
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] twoSumOptimised(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int diff = target-nums[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff), i};
            }else{
                map.put(nums[i],i);
            }
        }
        throw new IllegalArgumentException("No solution found");
    }
}
