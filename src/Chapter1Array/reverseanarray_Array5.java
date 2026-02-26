package Chapter1Array;

import java.util.Scanner;

public class reverseanarray_Array5 {
    public static void main(String[] args) {
        System.out.println("Please enter the elements in array: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter "+ n + " Elements " + ": ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }
        System.out.print("Array Elements are: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.print("Array Elements in reverse order are: ");
        for (int i = arr.length-1; i >= 0; i--){
            System.out.print(arr[i]+ " ");
        }
    }
}
