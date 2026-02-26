import java.util.Scanner;

public class oddevenbitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your no. : ");
        int num = input.nextInt();
        if((num&1) == 1){
            System.out.println("Your no. is odd");
        }else{
            System.out.println("Your no. is even");
        }
    }
}
