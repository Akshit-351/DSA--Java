package Collections;

import java.util.ArrayList;
import java.util.List;

public class removeallelementsfromlist {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i<=5; i++){
            list.add(i);
        }
        System.out.println("List is: "+list);
        list.clear();
        System.out.println("list is: "+list);
        if(list.isEmpty()){
            System.out.println("List is empty");
        }else {
            System.out.println("List is not empty");
        }
    }
}
