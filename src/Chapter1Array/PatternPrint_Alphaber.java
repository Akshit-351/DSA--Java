package Chapter1Array;

// A B C D
// A B C D
// A B C D
// A B C D

import java.util.Scanner;

public class PatternPrint_Alphaber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        int column = input.nextInt();
        for (int i = 0; i<rows; i++){
            for (int j = 0; j<column; j++){
                System.out.print((char) (j+65)+ " ");
            }
            System.out.println();
        }
        for (int i = 0; i<rows; i++){
            for (int j = 0; j<column ; j++){
                System.out.print((char) (j+97) +" ");
            }
            System.out.println();
        }
    }
}
