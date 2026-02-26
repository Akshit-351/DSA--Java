package Chapter1Array;

import java.util.ArrayList;

public class ArrayListInJava {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(23);
        list.add(22);
        list.add(12);
        System.out.println(list.get(2));
        list.set(3,35);
        System.out.println(list);
        int n = list.size();
        for (int i = 0; i<n; i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        list.remove(2);
        list.remove(Integer.valueOf(10));
        System.out.println(list);
    }
}
