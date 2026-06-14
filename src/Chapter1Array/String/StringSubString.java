package Chapter1Array.String;

public class StringSubString{
    public static String substring(String str , int SI , int EI){  //SI = Start Index, EI = Ending Index
        String substr = "";
        for (int i = SI; i<EI; i++){
            substr += str.charAt(i);
        }
        return substr;

    }
    public static void main(String[] args) {
        String str = "HelloWorld";
//       Java built in method:  System.out.println(str.substring(0,6));
        System.out.println(substring(str,0,6));
    }
}
