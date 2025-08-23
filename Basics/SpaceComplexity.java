package Basics;


public class SpaceComplexity {

    public static void main(String[] args) {
        int inp = 2;  // enter the value to visualize time complexity
        System.out.println(O1(inp));
    }

    public static String O1(int inp){         // method for 0 1
        int res = inp;
        return "O1: done";
    }

}
