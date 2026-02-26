import java.util.Scanner;

class arithmetic {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to airthmetic calculator\n");
         System.out.print("Please enter first number: ");
         int first = input.nextInt();
         System.out.print("Now,please enter the second number: ");
         int second = input.nextInt();
         int add = first+second;
         int sub = first-second;
         int div = first/second;
         int mul = first*second;
         double mod = first%second;
         System.out.println("Addition of a nd b is: "+add);

         System.out.println(("Subtraction of a and b is: "+sub));

         System.out.println("Multiplication of a and b is: "+mul);

         System.out.println(("Divison of a and b is: "+div));

         System.out.println("Modulus of a and b is: "+mod);

     }
}
