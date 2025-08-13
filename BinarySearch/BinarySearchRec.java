package BinarySearch;

public class BinarySearchRec {
    public static void main(String[] args) {
        int[] input = {1,2,4,6,8,11,14,19};
        int item = 8;
        System.out.println(search(input, item));
    }

    public static int search(int[] input,int item){
        return recSearch(input, 0, input.length-1, item);
    }

    public static int recSearch(int[] input, int low, int high, int item){
        if(low > high){
            return -1;
        }
        int mid = low+(high-low)/2;
        if(input[mid] == item){
            return mid;
        }else if(item > input[mid]){
            return recSearch(input, mid + 1, high, item);
        }else{
            return recSearch(input, low, mid - 1, item);
        }
    }
}
