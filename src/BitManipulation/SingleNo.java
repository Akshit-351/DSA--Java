package BitManipulation;

public class SingleNo {
    public static void main(String[] args) {
        int nums[] = {4 , 2 ,1, 2, 1};
        int N = 0;
        for (int i = 0; i<nums.length; i++){
           N=  N^nums[i];
        }
        System.out.println(N);
    }
}
