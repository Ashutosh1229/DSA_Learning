package Arrays;

public class ArrayBasics {
    public static void main(String[] args) {
        int[] arr1 = new int[5];                  // for 1D array mentioning size is mandatory during initialization
        arr1[0] = 0;
        arr1[1] = 1;
        arr1[2] = 2;
        arr1[3] = 3;
        arr1[4] = 4;
        for (int i : arr1){                       // enhanced for loop traversal by element
            System.out.println(i);
        }

        int[] arr2 = {5,6,7,8,9};                 // 1D array direct allocation
        for (int i = 0 ; i<arr2.length ; i++){    // normal for loop traversal by index
            System.out.println(arr2[i]);
        }

        int[][] arr3 = new int[2][];              // for 2D array number of rows is mandatory during initialization
        arr3[0][0] = 11;
        arr3[0][1] = 12;
        arr3[1][0] = 13;
        arr3[1][1] = 14;
        for(int i=0;i<arr3.length;i++){
            for(int j=0;j<arr3[i].length;j++){    // normal for loop traversal by index
                System.out.print(arr3[i][j]);
            }
            System.out.println();
        }

        int[][] arr4 = {{1,2,3},{4,5,6},{7,8,9}};
        for (int[] numbs : arr4) {                // enhanced for loop traversal by element
            for (int anInt : numbs) {
                System.out.print(anInt);
            }
            System.out.println();
        }
    }
}
