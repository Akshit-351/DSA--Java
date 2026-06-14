package Collections.Stack;

import java.util.Stack;

public class StackMethods {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println("Stack is: " + st);
        System.out.println("Size of Stack is: "+st.size());
        System.out.println("Search Element 20 present at : "+st.search(20));
        System.out.println("Search Element 100 present at: "+st.search(100));

    }
}
