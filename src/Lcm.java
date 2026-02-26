import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Lcm calculator of two numbers");
        System.out.println("Please enter your first no.: ");
        int first = input.nextInt();
        System.out.println("please enter your second no. : ");
        int second = input.nextInt();
        int lcm = lcm(first, second);
        System.out.println("Lcm of two numbers is : " + lcm);

    }

    public static int lcm(int first, int second) {
        int i = 1;
        while (i<=second) {
            int factor = first * i;
            if (factor % second == 0) {
                return factor;
            }
            i++;
        }
        return 0;
    }
}