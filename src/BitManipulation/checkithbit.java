package BitManipulation;

public class checkithbit {
    public static void main(String[] args) {
        int n = 13;
        int i = 2;
        if(((n>>i)&1)==1){
            System.out.println("Bit is Set");
        }else {
            System.out.println("Bit is Not Set");
        }
    }
}
