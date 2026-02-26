import java.util.*;
public class Main {
        public static void main(String[]args){
            Scanner input = new Scanner(System.in);
            System.out.print("Please Enter your number: ");
            int n = input.nextInt();
            long fact = factorial(n);
System.out.println("Factorial of "+n+" is : "+fact);
        }
        public static long factorial(int num){
            if(num<2){
                return 1;
            }
            long fact = 1;
            for(int i=2;i<=num;i++){
                fact = fact*i;
            }
            return fact;

        }
    }

