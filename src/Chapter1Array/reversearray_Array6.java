package Chapter1Array;

import java.util.Scanner;

public class reversearray_Array6 {
    public static void main(String[] args) {
        System.out.print("Enter size: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements: " + " ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        int i = 0;
        int j = n - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
