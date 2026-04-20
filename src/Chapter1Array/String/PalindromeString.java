package Chapter1Array.String;

public class PalindromeString {
    public static boolean isPalindrome(String str){
        char[] arr = str.toCharArray();
        int left = 0;
        int right = str.length()-1;
        while (left<right){
            if (arr[left] != arr[right]){
                return false;
            }
            left++;
            right--;

        }
        return true;
    }
    public static void main(String[] args) {
        String str = "nitin";
        System.out.println(isPalindrome(str));
    }
}
