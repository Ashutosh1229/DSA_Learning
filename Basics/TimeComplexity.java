package Basics;


import java.util.Date;

public class TimeComplexity {

    public static void main(String[] args) {
        int inp = 2;  // enter the value to visualize time complexity
        System.out.println(O1(inp));
        System.out.println(ON(inp));
        System.out.println(ON2(inp));
    }

    public static String O1(int inp){         // method for 0 1
        int res = inp;
        return "O1: done";
    }

    public static String ON(int n){          // method for O N
        int res = 0;
        for(int i = 0; i< n ; i++){
            res += i;
        }
        return "ON: done";
    }

    public static String ON2(int n){         // method for O N square
        int res = 0;
        for(int i = 0; i< n ; i++){
            for(int j = 0; j< n ; j++){
                res = res + i + j;
            }
        }
        return "ON^2: done";
    }

    public static String OLogN(int n){       // method for O log N


        return "OLogN : done";
    }


}
