package BitManipulation;

public class Powerof2s {
    public static boolean isPowerofTwo(int n ){
        if (n<=0){
            return false;
        }
        while (n%2 == 0){
            n = n/2;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        int n1 = 16;
        System.out.println(isPowerofTwo(n1));
    }
}
