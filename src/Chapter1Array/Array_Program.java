package Chapter1Array;

public class Array_Program {
    public static void main(String[] args) {
        int[] arr = {10 , 20 ,30 ,45 , 58 ,34};
        for (int i = 0; i<arr.length; i++){
            if (i%2==0){
                System.out.print(arr[i]+10 + " ");
            }else {
                System.out.print(arr[i]*2 +" ");
            }
        }
    }
}
