package BinarySearch;

public class LowerBound {
    public static void main(String[] args) {
        int[] input = {1,1,2,4,4,6,6,6,8,8,8,11,14,14,19};
        int item = 8;
        System.out.println(findLB(input, item));
    }

    public static int findLB(int[] input, int item){
        int low = 0;
        int high = input.length -1;
        int res = -1;
        while (low<=high){
            int mid = low + (high-low)/2;
            if(input[mid] >= item){
                res = mid;
                high = mid - 1;
            } else{
                low = mid + 1;
            }
        }
        return res;
    }
}
