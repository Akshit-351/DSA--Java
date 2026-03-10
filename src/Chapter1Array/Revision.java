package Chapter1Array;

import java.util.Arrays;

public class Revision {
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left<right){
            while (left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while (left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;

        }
        return true;
    }

    public static void main(String[] args) {
        String s = "Ni Ti,n";
        System.out.print(isPalindrome(s));
    }
//        int[] arr = { 2, 7 , 11, 15};
//        int target = 9;
//        int n = arr.length;
//        int[] result = twosum(arr, target);
//        System.out.println(Arrays.toString(result));
//    }
//    public static int[] twosum(int[] nums, int target){
////        Reverse Array
//        int [] arr = {19 , 24 ,1 ,45 ,34 ,765 ,234};
//        int n = arr.length;
//        int i = 0;
//        int j = n-1;
//        while (i<j){
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            i++;
//            j--;
//        }
//        for(int x : arr){
//            System.out.print(x);
//        }
        //Move zeros
//        int[] arr = {2, 0, 2, 8, 0, 4, 64, 3, 0};
//        int k = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != 0) {
//                arr[k] = arr[i];
//                k++;
//            }
//        }
//            while (k < arr.length) {
//                arr[k] = 0;
//                k++;
//            }
//            for (int x : arr) {
//                System.out.print(x);
//            }
//        int[] arr = {23 , 35 ,2 , 63 ,34 ,45};
//        int n = arr.length;
//        int temp = arr[n-1];
//        for (int i = n-1; i>0; i--){
//            arr[i] = arr[i-1];
//        }
//        arr[0] = temp;
//        for (int x: arr){
//            System.out.print(x + " ");
//        }
//        int[] arr = {1, 2, 3, 4, 5, 6};
//        int k = 3;
//        int n = arr.length;
//        k = k % n;
//        rev(arr, 0, k - 1);
//        rev(arr, k, n - 1);
//        rev(arr, 0, n - 1);
//        for (int x: arr){
//            System.out.print(x+ " ");
//
//        }
//    }
//          public static void rev(int[] arr , int l , int r) {
//              while (l < r) {
//                  int temp = arr[l];
//                  arr[l] = arr[r];
//                  arr[r] = temp;
//                  l++;
//                  r--;
//              }
        // Remove Duplicates from the sorting array
//        int [] arr = { 5 ,5  , 6 , 6 ,7, 8 , 9 , 9};
//        int x = 0;
//        for(int i = 1; i<arr.length; i++){
//            if(arr[i] != arr[x]){
//                x++;
//                arr[x] = arr[i];
//            }
//        }
//        for (int i = 0; i<=x; i++){
//            System.out.print(arr[i]+ " ");
//        }
        // Remove Duplicates from the sorting array using extra array
//        int [] arr = {5,5, 6, 7,7,8};
//        int n = arr.length;
//        int x = 0;
//        int [] new_arr = new int[n];
//        new_arr[x] = arr[0];
//        for (int i = 1; i<n; i++){
//            if (arr[i] != arr[i-1]){
//                x++;
//                new_arr[x] = arr[i];
//            }
//        }
//        for (int i = 0; i<=x; i++){
//            System.out.print(new_arr[i]+" ");
//        }
        //Two sum
//        for (int i = 0; i<nums.length; i++){
//            for (int j = i+1; j<nums.length; j++){
//                if (nums[i]+nums[j] == target){
//                    return new int[] {i,j};
//                }
//            }
//        }
//        return new int[] {-1,-1};


    }


