package java_revision;

import java.util.Scanner;

public class AreaofTriangle_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the base of triangle: ");
        double base = input.nextDouble();
        System.out.println("Please enter the height of triangle: ");
        double height = input.nextDouble();
        double area = 0.5*(base * height);
        System.out.println("The area of triangle is: "+area);
    }
}
