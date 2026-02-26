package Chapter1Array;

public class rotate_arrayby1_Array8 {
    public static void main(String[] args) {
        int arr[] = {1, 2 , 3 , 4 , 6, 8};
        int n = arr.length;
        int temp = arr[n-1];
        for (int i = n-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        for (int x:arr){
            System.out.print(x + " ");
        }
    }
}
