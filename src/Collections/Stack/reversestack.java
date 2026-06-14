package Collections.Stack;

import java.util.Stack;

public class reversestack {
    public static void Stackreverse(Stack<Integer> st,int data) {
        if (st.isEmpty()) {
            st.push(data);
            return;

        }
        int top = st.pop();
        Stackreverse(st,data);
        st.push(top);
    }
    public static void reverse(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int top = st.pop();
        reverse(st);
        Stackreverse(st,top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println("Original Stack: "+st);
        reverse(st);
        System.out.println("After reverse: "+ st);
    }
}
