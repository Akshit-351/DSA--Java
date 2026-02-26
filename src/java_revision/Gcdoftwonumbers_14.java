package java_revision;

import java.util.Scanner;

public class Gcdoftwonumbers_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first no. : ");
        int first = input.nextInt();
        System.out.println("Please enter the second no. : ");
        int second = input.nextInt();
        int gcd = gcd(first,second);
        System.out.println("GCD of two numbers is : "+gcd);
    }
    public static int gcd(int first , int second){
        int gcd = 1;
        int i = 2;
        int least = Math.min(first,second);
        while (i<=least){
            if (first % i == 0 && second % i == 0){
                return gcd = i ;
            }
            i++;
        }
        return gcd;
    }
}
