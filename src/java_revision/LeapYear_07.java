package java_revision;

import java.util.Scanner;

public class LeapYear_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the year you want to check: ");
        int year = input.nextInt();
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0){
            System.out.println("Your year is a leap year");

        }else {
            System.out.println("Your year is not a leap year");
        }
    }
}
