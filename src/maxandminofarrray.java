import java.util.Scanner;

public class maxandminofarrray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the no. of array you want to take: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Please enter Element " + (i + 1) + ":");
            arr[i] = input.nextInt();
            i++;
        }
        int max = max(arr);
        int min = min(arr);
        System.out.println("Max of the array is: "+max);
        System.out.println("Min of the array is: "+min);
    }

    public static int max(int[] arr) {
        if(arr.length==0){
            return Integer.MIN_VALUE;
        }
        int  max = arr[0];
        int i = 1;
        while (i<arr.length){
            if (max<arr[i]){
                max=arr[i];
            }
            i++;
        }
        return max;
    }
    public static int min(int[] arr) {
        int min = arr[0];
        int i = 1;
        while (i<arr.length){
            if (min>arr[i]){
                min = arr[i];
            }
            i++;
        }

        return min;
    }
}