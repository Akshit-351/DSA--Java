package Chapter1Array;

import java.util.Scanner;

public class PatternPrint_Number2 {
    public static void main(String[] args) {
        System.out.print("Enter the no of rows: ");
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int column = input.nextInt();
        for (int i = 1; i<=row; i++){
            //System.out.println("* * * * *");
            for (int j = 1; j<=column; j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}
