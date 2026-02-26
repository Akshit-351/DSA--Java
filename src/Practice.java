import java.util.*;

public class Practice {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.print("Numbers in decreasing order from " + x + " are ");

        int i = x;
        while (i > 0) {
            System.out.print(i + " ");
            i--;
        }
    }
}
