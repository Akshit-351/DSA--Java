package Chapter1Array;

public class Largestofthree_4Array {
    public static void main(String[] args) {
        int arr[] = { 23 , 32 , 34, 2 , 45};
        int max = arr[0];
        for (int i = 1; i<arr.length; i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("The maximum element is : "+max);
    }
}
