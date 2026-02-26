import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Palindrome no. Checker");
        System.out.println("Enter your no.: ");
        int num = input.nextInt();
        boolean isPalindrome= isPalindrome(num);
        if (isPalindrome) {
            System.out.println("Palindrome number");
        }else{
            System.out.println("Not Palindrome ");
        }
    }
    public static boolean isPalindrome(int num){
    int numcopy = num;
    int reversenum = 0;
    while (num>0){
        int rem = num%10;
        reversenum = reversenum*10+rem;
        num /= 10;
    }
    return reversenum == numcopy;
    }
}
