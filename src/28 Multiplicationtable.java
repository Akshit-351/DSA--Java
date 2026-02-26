import java.util.Scanner;

class Multiplicationtable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Multiplicationn table");
        System.out.print("Please enter your no.: ");
        int num = input.nextInt();
        printmultiplicationtable(num);
    }

    public static int printmultiplicationtable(int num) {
        int i = 1;
        while (i <= 10) {
            System.out.println(num + "x" + i + "=" + num * i);
            i++;
        }



    return 0;
    }
}
