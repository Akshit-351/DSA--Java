package Chapter1Array.Sorting;

public class InsertionSort {
    public static int[] InsertionSort(int[] arr){
        int n = arr.length;
        for (int i = 1; i<n; i++){
            int curr = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j] > curr){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {64,11,12,22,10};
        arr = InsertionSort(arr);
        for (int num:arr)
            System.out.print(num+" ");
        

    }
}
