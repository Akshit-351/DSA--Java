package Chapter1Array;
import java.util.Arrays;
public class SortArrayBuiltIn {
    public static void main(String[] args) {
        int[] arr = {10 , 24 , 13 , 56 ,13 ,53, 23};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }

    public static void print(int [] jaat) {
        for (int i = 0; i<jaat.length; i++){
    System.out.print(jaat[i] + " ");
}
        System.out.println();
    }
}
