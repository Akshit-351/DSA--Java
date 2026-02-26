package Chapter1Array;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = { 5 , 5, 6, 7 , 7 , 8 , 9};
        int new_arr[] = new int[7];
        int x = 0;
        new_arr[x] = arr[0];
        for(int i = 1; i<arr.length; i++ ){
            if (new_arr[x] != arr[i]){
                x++;
                new_arr[x] = arr[i];
            }
        }
        for (int i = 0; i<=x; i++) {
            System.out.print(new_arr[i]+ " ");
        }
    }
}
