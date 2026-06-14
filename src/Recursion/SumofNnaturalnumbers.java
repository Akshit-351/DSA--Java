package Recursion;

public class SumofNnaturalnumbers {
    public static int fact(int n){
        if(n==1){
            return 1;
        }
        return n+fact(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Sum of first "+n+" natural numbers is: "+fact(n));
    }
}
