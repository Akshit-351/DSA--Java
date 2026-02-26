package Chapter1Array;

public class SearchInArray {
    public static boolean search(int[] arr , int x) {
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr = {10 , 29 , 43 , 23 ,45 , 22 ,54 , 23};
        int x = 23;
        System.out.println(search(arr,x));
    }
}
