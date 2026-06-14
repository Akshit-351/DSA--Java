package Collections.Stack;

import java.util.Stack;

public class pushatbottom {
    public static void pushAtBottom(Stack<Integer> st, int data){
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        int top = st.pop();
        pushAtBottom(st, data);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        int data = 5;
        pushAtBottom(st,data);
        System.out.println(st);
    }
}
