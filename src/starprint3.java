import java.util.Scanner;

public class starprint3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("3rd Star printing");
        patternnew();
    }

    public static void patternnew() {
        int rows =1 ;
        while (rows<=5){
            int j = 5;
            while (j>rows) {
                System.out.print("  ");
                j--;
            }
            int i = 0;
            while(i<rows){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows++;
        }

    }

}
