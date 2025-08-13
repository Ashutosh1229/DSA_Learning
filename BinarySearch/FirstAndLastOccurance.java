package BinarySearch;

public class FirstAndLastOccurance {
    public static void main(String[] args) {
        int[] input = {1,1,2,4,4,6,6,6,8,8,8,11,14,14,19};
        int item = 6;
        findOccurance(input, item);
    }

    public static void findOccurance(int[] input, int item){
        int low = 0;
        int high = input.length -1;
        int first = -1;
        int last = input.length;
        while (low<=high){
            int mid = low + (high-low)/2;
            if(input[mid] == item){
                first = mid;
                high = mid - 1;
            } else if(input[mid] < item){
                low = mid + 1;
            } else{
                high = mid - 1;
            }
        }
        if(first == -1){
            System.out.println(item+" not found!!");
            return;
        }
        low = 0;
        high = input.length -1;
        while (low<=high){
            int mid = low + (high-low)/2;
            if(input[mid] == item){
                last = mid;
                low = mid + 1;
            } else if(input[mid] < item){
                low = mid + 1;
            } else{
                high = mid - 1;
            }
        }
        System.out.println("first index:"+first+"\nlast index:"+last);
    }
}
