package java_revision;

import java.util.Scanner;

public class SwapTwoNo_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of A: ");
        int a = input.nextInt();
        System.out.print("Enter value of B: ");
        int b = input.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println("The value of A is : "+a);
        System.out.println("The value of B is : "+ b);
    }
}
