package java_revision;

import java.util.Scanner;

public class sum_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the sum of odd no. to n digits");
        System.out.print("Please enter a digit upto find a sum : ");
        int num = input.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= num) {
            sum = sum + i;
            i += 2;
        }
        System.out.println("The  sum of odd no. to n digits : "+ sum);
    }
}
