package BitManipulation;

public class SetithBit {
    public static void main(String[] args) {
        int N = 9;
        int i = 2;
        N = N|(1<<i);
        System.out.println(N);
    }
}
