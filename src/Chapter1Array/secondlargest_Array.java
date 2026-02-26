package Chapter1Array;

public class secondlargest_Array {
    public static void main(String[] args) {
        int[] arr = {100 , 103 , 334, 232, 99, 23, 35};
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > largest){
                largest = arr[i];
            }
        }
        int seclargest = Integer.MIN_VALUE;
        for (int i = 0; i< arr.length; i++){
            if (arr[i]<largest && arr[i] >= seclargest){
                seclargest = arr[i];
            }
        }
        System.out.println("Second largest element in array is : "+ seclargest);
    }
}
