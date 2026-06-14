package Collections;
import  java.util.Iterator;
import java.util.ArrayList;
public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 5; i++)
            list.add(i * 5);
        System.out.println("Display using Iterator: ");
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            Integer ele = itr.next();
            System.out.println(ele);
        }
    }
}
