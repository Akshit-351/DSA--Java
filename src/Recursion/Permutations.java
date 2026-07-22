package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void permute(int[] arr, int i, List<Integer> curr, List<List<Integer>> ans){
        if(i == arr.length){
            ans.add(new ArrayList<Integer>(curr));
            return ;
        }
        curr.add(arr[i]);
        permute(arr,i+1,curr,ans);
    }
    public static void main(String[] args) {
        int arr[] = {1 ,2 , 3};
        List<List<Integer>> ans;

    }
}
