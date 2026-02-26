package Chapter1Array;

import java.util.Arrays;

public class MissingArray {
    public static void main(String[] args) {
        int[] arr = {1};
//        Arrays.sort(arr);
//        int k = 0;
//        for (int i = 1; i<arr.length; i++){
//            if (arr[k] == arr[i]-1){
//                k++;
//            }else {
//               System.out.println( arr[i]-1);
//               return;
//            }
//        }
        int n = arr.length+1;
        int expected = n*(n+1)/2; // sum if no number was missing
        int actual = 0;
        for (int x:arr){
            actual = actual + x;
        }
        System.out.println(expected-actual);
    }
}
