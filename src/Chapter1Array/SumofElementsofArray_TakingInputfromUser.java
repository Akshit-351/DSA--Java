package Chapter1Array;
// print SumofElementsofArray by TakingInputfromUser

import java.util.Scanner;

public class SumofElementsofArray_TakingInputfromUser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.print("The array elements are: ");
        for (int i = 0; i<arr.length; i++){
            arr[i] = input.nextInt();
        }
        int sum = 0;
        for (int i = 0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.print("The sum of array elements is: "+sum);
    }
}
