package Arrays;

import java.util.Arrays;

public class SubArraySum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6};
        int target = 10;
        System.out.println(subarraySum(arr, target));

    }

    public static int subarraySum(int[] nums, int k) {
        int count = 0 ;
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = i; j < nums.length; j++){
                sum = sum + nums[j];
                if(sum == k){
                    count++;
                }
            }
        }
        return count;
    }
}
