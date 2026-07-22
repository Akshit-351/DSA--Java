package Recursion;

public class printoneton {
    public static void printton(int n){
        if(n == 0){
            return;
        }
        printton(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n = 5;
        printton(n);
    }
}
