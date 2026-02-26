package java_revision;

import java.util.Scanner;

public class Reverseofadigit_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a digit: ");
        int num = input.nextInt();
        int reverse = 0;
        while (num>0){
            int digit = num % 10 ;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        System.out.println("The reverse of "+ num + "is : "+ reverse);
    }
}
