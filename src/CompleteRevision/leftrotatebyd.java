package CompleteRevision;

public class leftrotatebyd {
    public static void main(String[] args) {
        int[] arr = { 1 , 2, 3, 4, 5};
        int d = 2;
        int n = arr.length;
        d = d%n;
        rev(arr , 0 , d-1);
        rev(arr, d, n-1);
        rev(arr, 0 , n-1);
        for (int x:arr){
            System.out.print(x+ " ");
        }
    }
    static void rev(int[] arr , int l, int r){
        while (l<r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }

}
