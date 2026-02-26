import java.util.Scanner;

public class reversedigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Reverse of a digit calculator");
        System.out.println("please enter your no.: ");
        int num = input.nextInt();
        int reversenum = reversenum(num);
        System.out.println("The reverse digit of the number is : "+reversenum);
    }

    public static int reversenum(int num) {
        int newNum = 0;
        while(num>0){
            int digit = num%10;
            newNum = newNum*10+digit;
            num = num/10;

        }
        return newNum ;

    }
}
