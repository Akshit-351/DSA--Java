import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to armstrong no. Checker");
        System.out.println("Enter your no.: ");
        int num = input.nextInt();
        boolean isArmstrong= isArmstrong(num);
        if (isArmstrong) {
            System.out.println("Armstrong number");
        }else{
                System.out.println("Not Armstrong ");
            }
        }

    public static boolean isArmstrong(int num){
        int originalnum = num;
                int i =0;
        while (num>0){
            int rem = num%10;
            i = (rem*rem*rem)+i;
            num = num/10;
        }
return i == originalnum;
    }
}
