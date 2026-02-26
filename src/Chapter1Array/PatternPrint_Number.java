package Chapter1Array;

import java.util.Scanner;

public class PatternPrint_Number {
    public static void main(String[] args) {
        System.out.print("Enter the no of rows: ");
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        for (int i = 0; i<row; i++){
            //System.out.println("* * * * *");
            for (int j = 0; j<row; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
