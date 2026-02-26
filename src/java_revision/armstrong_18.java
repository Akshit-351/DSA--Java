package java_revision;

import java.util.Scanner;

public class armstrong_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = input.nextInt();
        boolean isArmstong = isArmstrong(num);
        if (isArmstong) {
            System.out.println("Your number is a Armstrong no.");
        } else {
            System.out.println("your number is not a Armstrong no.");
        }
    }
    public static  boolean isArmstrong(int num){
        int originalnum = num;
        int sum = 0;
        while (num>0){
            int rem = num % 10;
            sum = sum + (rem*rem*rem);
            num = num/10;
        }
        return sum == originalnum;
    }
}
