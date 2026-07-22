package Recursion;

public class TilingProblem {
    public static int tilingproblem(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        int verticalWays = tilingproblem(n-1);
        int horizontalWays = tilingproblem(n-2);
        return verticalWays+horizontalWays;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(tilingproblem(n));
    }
}
