package java_revision;

import java.util.Scanner;

public class ProductofTwoFloatingNo_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first no. : ");
        double first = input.nextDouble();
        System.out.println("Ente second no. : ");
        double second = input.nextDouble();
        double mul = first*second;
        System.out.println("The multiplication of two numbers is: "+ mul);
    }
}
