package Chapter1Array.SlidingWindow;

public class MaxSubarraysSum {
    public static void printsubarrayssum(int[] arr) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i<n; i++){
            for (int j = i; j<n; j++){
                currSum = 0;
                for (int k = i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                    currSum = currSum+arr[k];
                }
                if (maxSum<currSum){
                    maxSum = currSum;
                }
                System.out.println();
                System.out.print("The sum of this subarrays is: "+currSum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("The maximum sum is: "+maxSum);


    }
    public static void main(String[] args) {
        int[] arr = {-1, 2 , 4 , -8 , -1 , 8 , -3, 9};
        printsubarrayssum(arr);
    }
}
