package Chapter1Array.SlidingWindow;

public class PrintSubarrays {
    public static void printsubarrays(int[] arr) {
        int n = arr.length;
        int TotalSubarrays = 0;
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                TotalSubarrays++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("TotalSubarrays" + "=" + TotalSubarrays);
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        printsubarrays(arr);
    }
}
