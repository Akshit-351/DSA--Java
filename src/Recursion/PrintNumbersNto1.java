package Recursion;

public class PrintNumbersNto1 {
    public static void printDec(int n){
        // base case
        if(n == 0){
            return;
            // agr 0 hoti h toh function vhi ruk jayega
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        printDec(n);

    }
}
