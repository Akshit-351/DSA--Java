package Chapter1Array.Sorting;

public class BubbleSort {
    public static int[] bubblesort(int[] arr){
        int n = arr.length;
        for (int i = 0; i<n-1; i++){
            for (int j = 0; j<n-i-1; j++){
                if (arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {7,1,6,10,14,9};
        arr = bubblesort(arr);
        for (int num:arr){
            System.out.print(num+" ");
        }
    }
}
