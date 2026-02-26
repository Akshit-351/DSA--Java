import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to fibonacci series");
        System.out.println("Please enter your no.: ");
        int num = input.nextInt();
        System.out.print("fibonacci series till "+num+" is: ");
        fibonacciseries(num);

    }
    public static void fibonacciseries(int num){
        if(num < 0)return;
        System.out.print(0+" ");
        if(num == 0)return;
        System.out.print(1+" ");

        int first = 0 , second = 1;
        while(first + second <= num) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
}
