package Chapter1Array;

import java.util.Scanner;

public class TakingInputfromuser_3Array {
    public static void main(String[] args) {
        System.out.print("Please enter the number of values : ");
        Scanner input = new Scanner(System.in);
        // Ask size
        int n = input.nextInt();
        // create array
        int arr[] = new int[n];
        //Take input
        System.out.print("Enter " + n + " Elements : ");
        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        //Print array
        System.out.print("The array values are: ");
        for (int i = 0; i<n; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
