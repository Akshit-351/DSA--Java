package Chapter1Array;

public class maxminofarray {
    public static void main(String[] args) {
        int [] arr = { 2, 3, 5,52 , 24 , 34,23,78,23};
        int max = Integer.MIN_VALUE;
        int min = arr[0];
        for (int i =0; i<arr.length; i++){
            if (arr[i]>max){
                max = arr[i];
            }
            if (arr[i]<min){
                min = arr[i];
            }

        }
        System.out.println("The maximum element is: "+max);
        System.out.println("The minimum element is: "+min);
    }
}
