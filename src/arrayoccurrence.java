import java.util.Scanner;

public class arrayoccurrence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the no. of array you want to take: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        int i = 0;
        while (i<size){
            System.out.print("Please enter Element "+(i+1)+":");
            arr[i] = input.nextInt();
            i++;
        }
        System.out.println("Please Enter the element you want to search for: ");
        int num = input.nextInt();
        int occurence = occurence(arr,num);
        System.out.println("Your element was found "+occurence+" times in the array");
    }
    public static int occurence(int[] arr ,int num){
        int  i = 0;
        int occur = 0;
        while (i<arr.length){
            if (arr[i] == num){
                occur++;
            }
            i++;
        }
        return occur;
    }
}
