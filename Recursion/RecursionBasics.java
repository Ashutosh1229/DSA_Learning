package Recursion;

public class RecursionBasics {
    public static void main(String[] args) {
        int n = 7; // input
        openRussianDolls(n);
    }

    static void openRussianDolls(int n){
        if(n==0){
            System.out.println("All dolls are open.");
        }else {
            switch (n){
                case 1 -> System.out.println(n+"st doll is opened");
                case 2 -> System.out.println(n+"nd doll is opened");
                case 3 -> System.out.println(n+"rd doll is opened");
                default -> System.out.println(n+"th doll is opened");
            }
            openRussianDolls(n-1);
        }
    }
}
