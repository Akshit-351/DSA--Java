package Chapter1Array.Sorting;

public class SelectionSort {
    public static int[] selectionsort(int[] arr){
        int n = arr.length;

        for (int i = 0; i<n; i++){
            int minindex = i;
            for (int j = i+1; j<n; j++){
                if (arr[j]<arr[minindex]){
                  minindex = j;
                }

            }
            int temp = arr[i];
            arr[i] = arr[minindex];
            arr[minindex] = temp;

        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {64,11,12,22,10};
        arr = selectionsort(arr);
        for (int num:arr)
        System.out.print(num+" ");
    }
}
