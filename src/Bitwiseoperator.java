import java.util.Scanner;

public class Bitwiseoperator {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter first no. : ");
        int first = input.nextInt();
        System.out.println("Enter Second no. : ");
        int second = input.nextInt();
        int result = first & second;
        System.out.println("Result is : "+result);
    }
}
