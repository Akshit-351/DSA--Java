import java.util.Scanner;

class sumandaverageofarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        int sum = 0;

        int i = 0;
        while(i < size) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = input.nextInt();
            sum += arr[i];
            i++;
        }

        double average = (double) sum / size;
        System.out.println("Sum of array is: " + sum);
        System.out.println("Average of array is: " + average);
    }
}