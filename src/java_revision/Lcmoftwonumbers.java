package java_revision;

import java.util.Scanner;

public class Lcmoftwonumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first no. : ");
        int first = input.nextInt();
        System.out.println("Please enter second no. : ");
        int second = input.nextInt();
        int lcm = lcm(first ,second);
        System.out.println("Lcm of two numbers is : "+lcm);
    }

    public static int lcm(int first , int second) {
        int i = 1;
        while (i <= second){
            int fact = first*i;
            if (fact % second == 0 ){
                return fact;
            }
            i++;
        }
        return 0;
    }
}
