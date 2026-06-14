package Collections;

import java.util.ArrayList;

public class MergetwoArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        for (int i = 1; i<=5; i++)
            a1.add(i*5);
            System.out.println("a1 list is: "+a1);

        ArrayList<Integer> a2 = new ArrayList<>();
        for (int i = 5; i>=1; i--)
            a2.add(i*5);
            System.out.println("a2 list is: "+a2);

            a1.addAll(a2);
            System.out.println("List after merge both the lists: "+a1);

    }
}
