import java.util.Scanner;

class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to factorial program");
        System.out.println("please enter your number: ");
        int num = input.nextInt();
        long fact = factorialofnumber(num);
        System.out.println("Factorial of "+num+" is: "+fact);


    }

    public static long factorialofnumber(int num) {
        if(num<2){
            return 1;
        }
        long fact = 1;
        int i = 1;
        while (i<=num){
            fact = fact*i;
            i++;
        }
        return fact;
    }
}
