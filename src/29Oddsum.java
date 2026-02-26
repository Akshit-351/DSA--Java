import java.util.Scanner;

class Oddsum {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("welcome to the sum to odd no. to num n");
         System.out.print("Please enter your no.: ");
         int num  = input.nextInt();
         int sum = oddsum(num);
         System.out.println("Odd Sum till "+ num +" is: "+sum);
     }

    public static int oddsum(int num) {
         int sum = 0;
         int i = 1;
         while(i<=num){
             sum = sum+i;
             i = i+2;

         }
         return sum;

    }
}
