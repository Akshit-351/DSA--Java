package Recursion;

import java.util.Stack;

public class removeduplicatesfromstring {
    public static void removeDuplicates(String str,int idx,String newStr, boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return ;
        }
        char curr = str.charAt(idx);
        if(map[curr - 'a'] == true){
            removeDuplicates(str,idx+1,newStr,map);
        }else {
            map[curr - 'a'] = true;
            removeDuplicates(str,idx+1,curr+newStr,map);
        }

//    public static String removeDuplicates(String str){
//
//        Stack<Character> stk = new Stack<>();
//
//        for(int i=0; i<str.length(); i++){
//
//            char ch = str.charAt(i);
//
//            if(!stk.contains(ch)){
//                stk.push(ch);
//            }
//        }
//
//        StringBuilder ans = new StringBuilder();
//
//        for(char c : stk){
//            ans.append(c);
//        }
//
//        return ans.toString();
    }
    public static void main(String[] args) {
        String str = "apnacollege";
//        System.out.println(removeDuplicates(str));
      removeDuplicates(str,0,"",new boolean [26]);
    }
}
