package java_revision;

import java.util.Scanner;

public class Primeornot_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a no : ");
        int num = input.nextInt();
        boolean isPrime = isPrime(num);
        if (isPrime){
            System.out.println("Your no. is Prime");
        }else {
            System.out.println("Your number is not a prime no.");
        }
    }
    public static boolean isPrime(int num){
        int i = 2;
        while (i<=num){
            if ( num % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
