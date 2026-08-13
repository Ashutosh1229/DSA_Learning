package Arrays;

import java.util.Arrays;

public class CountEvenNumbers {
    public static void main(String[] args) {
        int[] arr = {1,2,3,63};
        System.out.println(findNumbers(arr));

    }

    public static int findNumbers(int[] nums) {
        int numCounter = 0 ;
        for (int num : nums) {
            int digitCounter = 0;

            if (num == 0) {
                digitCounter = 1;
            } else {
                int n = num;
                while (n > 0) {
                    n /= 10;
                    digitCounter++;
                }
            }
            if (digitCounter % 2 == 0) {
                numCounter++;
            }
        }
        return numCounter;
    }
}
