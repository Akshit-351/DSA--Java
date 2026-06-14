package CompleteRevision;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        System.out.print("Enter no. of Elements: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        System.out.print("Array elements are: ");
        for (int i = 0; i<n; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("The array Elements are: ");
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
