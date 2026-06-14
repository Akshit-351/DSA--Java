package Collections;

import java.util.ArrayList;

public class ArrayListTraversalusingloop {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(20);
        number.add(34);
        number.add(25);
        number.add(35);
        for (int i = 0; i<number.size(); i++){
            System.out.print(number.get(i)+" ");
        }
        System.out.println();
        //enhanced for loop
        for(int num:number){
            System.out.print(num +" ");
        }
    }
}
