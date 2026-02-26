import java.util.Scanner;

class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Prime no. Checker");
        System.out.println("Please enter your no. : ");
        int num = input.nextInt();
        boolean primechecker = primechecker(num);
        if(primechecker) {
            System.out.println("Your no. is prime");
        }else {
            System.out.println("Not");
        }
    }

    public static boolean primechecker(int num) {
        int i = 2;
        while(i<num){
            if(num%i==0) {
                return false;
            }
            i++;
            }
        return true;
    }

    }
