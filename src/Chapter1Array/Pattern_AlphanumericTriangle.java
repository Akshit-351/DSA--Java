package Chapter1Array;

import java.util.Scanner;

public class Pattern_AlphanumericTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();

        for (int i = 1; i <= rows; i++) {

            // Even row → Numbers
            if (i % 2 == 0) {
                for (int j = 1; j <= i + 1; j++) {
                    System.out.print(j + " ");
                }
            }
            // Odd row → Alphabets
            else {
                for (int j = 0; j <= i; j++) {
                    System.out.print((char)(65 + j) + " ");
                }
            }

            System.out.println();
        }
    }
}

