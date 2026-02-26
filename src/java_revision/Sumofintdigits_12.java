package java_revision;

import java.util.Scanner;

public class Sumofintdigits_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to sum of digits of a number");
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        int sum = 0;
        while (num > 0){
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println("The sum of digits of a number is : " + sum);
    }
}
