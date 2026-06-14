package Collections;

import java.util.ArrayList;

public class ArrayListInteger {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(34);
        numbers.add(25);
        numbers.add(35);
        System.out.println(numbers.get(2));
        System.out.println(numbers.size());
    }
}
