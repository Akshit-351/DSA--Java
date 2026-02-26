package java_revision;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the program to the factorial of a given number");
        System.out.print("Please provide a number : ");
        int num = input.nextInt();
        if (num < 2) {
            System.out.println("The Factorial is : 1");
            return;
        }
        long fact = 1;
        int i = 2;
        while (i<=num){
            fact = fact*i;
            i++;
        }
        System.out.println("Factorial of given no. is : "+fact);
    }
}