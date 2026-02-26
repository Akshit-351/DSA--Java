import java.util.Scanner;

class sumofdigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to sum of digits of an integer");
        System.out.println("please enter your no.: ");
        int num = input.nextInt();
        int sum = SumofDigits(num);
        System.out.println("Sum of integer of your"+num+"is"+sum);
    }

    public static int SumofDigits(int num) {
        int sum = 0;
        while(num>0){
            sum = sum+num%10;
            num = num/10;
        }
        return sum;

    }
}
