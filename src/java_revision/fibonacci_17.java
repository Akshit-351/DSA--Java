package java_revision;

import java.util.Scanner;

public class fibonacci_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a num : ");
        int num = input.nextInt();
        int first = 0;
        int second = 1;
        System.out.println("The fibonacci series is : ");
        if ( num >=1)
            System.out.print(first + " ");
        if (num >= 2)
            System.out.print(second+ " ");
        int i = 3;
        while (i<=num){
            int nextnum = first + second;
            System.out.print(nextnum + " ");
            first = second;
            second = nextnum;
            i++;
        }
    }
}
