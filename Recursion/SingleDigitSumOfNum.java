package Recursion;

public class SingleDigitSumOfNum {
    public static void main(String[] args) {
        int n = 12345; // input
        System.out.println(getSingleSum(n, 0));
    }


    static int getSingleSum(int num, int sum){
        if(num/10 == 0){
            int res = sum+num;
            if((res)/10 > 0){
                return getSingleSum(res,0);
            }else{
                return res;
            }
        }else {
            return getSingleSum(num/10, sum+(num%10));
        }
    }
}
