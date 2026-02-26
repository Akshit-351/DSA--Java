package java_revision;

import java.util.Scanner;

public class Multiplicationtable_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to multiplication table ");
        System.out.print("Please enter a number : ");
        int num = input.nextInt();
        int i = 1;
        while (i<=10){
            System.out.println(num +"*" + i + "=" + num*i);
            i++;
        }
    }
}
