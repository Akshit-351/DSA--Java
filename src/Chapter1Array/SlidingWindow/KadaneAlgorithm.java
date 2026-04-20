package Chapter1Array.SlidingWindow;

//public class KadaneAlgorithm {
//    public static void kadane(int[] arr){
//        int currSum = arr[0];
//        int maxSum = arr[0];
//        for (int i = 1; i<arr.length; i++){
//            currSum = currSum + arr[i];
//            if (currSum<0){
//                currSum = 0;
//            }
//            maxSum = Math.max(currSum,maxSum);
//        }
//        System.out.println("Max sub is: "+maxSum);
//    }
//
//    public static void main(String[] args) {
//        int [] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
//        kadane(arr);
//
//    }
//}
// IF the subarray contains all negative like [-2,-5,-6,-7]
//Method 2 for kadane is this:
public class KadaneAlgorithm {
    public static void kadane(int[] arr){
        int currSum = arr[0];
        int maxSum = arr[0];
        for (int i = 1; i<arr.length; i++){
            currSum = Math.max(arr[i], currSum+arr[i]);
            maxSum = Math.max(currSum,maxSum);
        }
        System.out.println("Max sub is: "+maxSum);
    }

    public static void main(String[] args) {
        int [] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadane(arr);

    }
}
