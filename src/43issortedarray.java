import java.util.Scanner;
 class issortedarray {
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
         boolean isincreasing = isincreasing(arr);
         boolean isdecreasing = isdecreasing(arr);
         if (isincreasing || isdecreasing) {
             System.out.println("Your array is sorted");
         } else {
             System.out.println("Your array is not sorted");
         }
     }

     public static boolean isincreasing(int[] arr) {
         int i = 1;
         while (i < arr.length) {
             if (arr[i] < arr[i - 1]) {
                 return false;
             }
             i++;
         }
         return true;
     }

     public static boolean isdecreasing(int[] arr) {
         int i = 1;
         while (i < arr.length) {
             if (arr[i]>arr[i-1]){
                 return false;
             }
             i++;
         }
         return true;
     }
 }
