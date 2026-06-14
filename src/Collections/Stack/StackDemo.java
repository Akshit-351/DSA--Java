package Collections.Stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println("Stack is: "+st);
        System.out.println("Top Element of Stack is: "+st.peek());
        System.out.println(st.pop());
        System.out.println("After pop operation stack is: "+st);
        if(st.isEmpty()){
            System.out.println("Stack is Empty");
        }else{
            System.out.println("Stack is not Empty: "+st);
        }
    }
}
