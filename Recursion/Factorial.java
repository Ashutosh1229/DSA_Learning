package Recursion;

public class Factorial {
    public static void main(String[] args) {
        int n = 10; //input
        System.out.println(getFactorial(n));
    }

    static int getFactorial(int n){
        if(n==0){
            return 1;
        }
        return n*getFactorial(n-1);
    }
}
