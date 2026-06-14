package BitManipulation;

import java.lang.reflect.Array;
import java.util.Arrays;

public class countbits {
    public static int[] countBits(int n ){
        int ans[] = new int[n+1];
        for (int i = 1; i<=n; i++){
            ans[i] = ans[i/2] + i%2;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n1 = 5;
        System.out.println(Arrays.toString( countBits(n1)));
    }
}
