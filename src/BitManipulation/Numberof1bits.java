package BitManipulation;

import javax.swing.plaf.IconUIResource;

public class Numberof1bits {
    public static void main(String[] args) {
        int n = 11;
        String binary = Integer.toBinaryString(n);
        int count = 0;
        for (int i = 0; i<binary.length(); i++){
            if (binary.charAt(i) == '1'){
                count++;
            }
        }
        System.out.println(count);
    }
}
