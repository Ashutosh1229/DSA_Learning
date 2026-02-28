package Recursion;

public class SingleDigitSum {
    public static void main(String[] args) {
        String n = "Ashu"; // input
        System.out.println(getCharSum(n));
    }

    static int getCharSum(String word){
        int size = word.length();
        int total = 0;
        for(int i=0; i<size; i++){
            total = total+word.charAt(i);
        }
        return getSingleSum(total, 0);
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
