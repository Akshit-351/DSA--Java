package BitManipulation;

public class ToggleithBit {
    public static void main(String[] args) {
        int N = 13;
        int i = 2;
        N = N^(1<<i);
        System.out.println(N);
    }
}
