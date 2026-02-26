// Program to determine if a no. is positive negative or zero
package java_revision;

import java.util.Scanner;

public class PositiveNegativeorZero_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a no. : ");
        int num = input.nextInt();
        if(num==0){
            System.out.println("The no. is zero");
        } else if (num>0) {
            System.out.println("The number is positive");
        }else{
            System.out.println("The number is negative");
        }
    }
}
