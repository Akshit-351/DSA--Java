package java_revision;

import java.util.Scanner;

public class GreatestofThree_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter first no. : ");
        int first = input.nextInt();
        System.out.print("Please enter second no. : ");
        int second = input.nextInt();
        System.out.print("Please enter third no. : ");
        int third = input.nextInt();
        if(first>=second && first>=third){
            System.out.println(first + " no. is the greatest number");
        } else if (second>=third) {
            System.out.println(second+" no. is the greatest number");
        }else {
            System.out.println(third+ " no. is the greatest number");
        }
    }
}
