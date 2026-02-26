package Chapter1Array;

import java.util.Scanner;

public class PrintNegative_TakingInputfromUser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = input.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter array elements: " + " ");
        for (int i = 0; i<arr.length; i++){
            arr[i] = input.nextInt();
        }
        System.out.print("The negative elements of array are: ");
        for (int i = 0; i<arr.length; i++){
            if (arr[i]<0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
