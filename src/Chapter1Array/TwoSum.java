package Chapter1Array;

import java.util.HashMap;
import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {

        int arr[] = {3, 2, 4};
        int target = 6;

        int[] result = twoSum(arr, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int second = target - nums[i];

            if (map.containsKey(second)) {
                return new int[]{map.get(second), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }
}
