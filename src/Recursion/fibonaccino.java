package Recursion;

public class fibonaccino {
    public static int fibonacci(int n) {
        if (n == 0|| n ==1 ) {
            return n;
        }
        int fn = fibonacci(n - 1) + fibonacci(n - 2);
        return fn;
    }

    public static void main(String[] args) {
        int n = 8;
        System.out.println("Fibonacci sum of  " + n + " is: " + fibonacci(n));
    }
}
