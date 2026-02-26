package java_revision;

import java.util.Scanner;

public class palindrome_17 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
   System.out.print("Please enter a no. : ");
   int num = input.nextInt();
   boolean isPalindrome = isPalindrome(num);
   if (isPalindrome){
       System.out.println("Your no. is Palindrome number");
   }else {
       System.out.println("NOt a Palindrome number");
   }
}

    public static boolean isPalindrome(int num) {
        int originalnum = num;
        int sum = 0;
        while (num>0){
            int rem = num % 10;
            sum = sum*10 + rem;
            num = num / 10;
        }
        return sum == originalnum;
    }
}
