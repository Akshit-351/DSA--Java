package Chapter1Array.SlidingWindow;

public class MaxSubArrayPrefix{
    public static void printsubarrayprefix(int[] arr) {
        int n = arr.length;
        // build prefix array
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i<n; i++){
            prefix[i] = prefix[i-1]+arr[i];
        }
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i<n; i++){
            int start = i;
            for (int j = i; j<n; j++) {
                int end = j;
                if (start == 0) {
                    currSum = prefix[end];
                } else {
                    currSum = prefix[end] - prefix[start - 1];
                }
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("The maximum sum is: "+maxSum);


    }
    public static void main(String args[]) {
        int arr[] = {1, -2, 6, -1, 3};
        printsubarrayprefix(arr);
    }
}
