package BitManipulation;

public class Powerof2sOptimizedapproach {
    public static boolean isPoweroftwo(int n) {
        if (n<=0){
            return false;
        }
        return (n & (n-1)) == 0;
    }

    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPoweroftwo(n));
    }
}
