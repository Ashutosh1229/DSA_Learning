package BinarySearch;

public class KokoBanana {
    public static void main(String[] args) {
        int[] input = {3,6,7,11};
        int hrs = 8;
        System.out.println(findUB(input, hrs));
    }

    public static int findUB(int[] input, int item){
        int low = 0;
        int high = input.length -1;
        int res = input.length;
        while (low<=high){
            int mid = low + (high-low)/2;
            if(input[mid] > item){
                res = mid;
                high = mid - 1;
            } else{
                low = mid + 1;
            }
        }
        return res;
    }
}
