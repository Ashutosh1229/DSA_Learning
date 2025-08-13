package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] input = {1,2,4,6,8,11,14,19};
        int item = 3;
        System.out.println(search(input, item));
    }

    public static int search(int[] input,int item){
        int low = 0;
        int high = input.length -1;
        while (low <= high){
            int mid = (low + high) / 2;
            if(input[mid] == item){
                return mid;
            } else if ( item > input[mid]) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return -1;
    }
}
