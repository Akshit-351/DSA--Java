package java_revision;

public class rightangledtrianglepattern_08 {
    public static void main(String[] args) {
        int rows = 1;
        while (rows<=5) {
            int i = 1;
            while (i <= rows) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows++;
        }
    }
}
