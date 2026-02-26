package Chapter1Array;

public class PassingArrayToMethods {
    public static void main(String[] args) {
        int[] x = {10 , 34 , 35 , 26 , 63};
        System.out.println(x[2]);
        change(x);
        System.out.print(x[2]);
    }
    public static void change(int[] y){
        y[2] = 87;
    }
}
