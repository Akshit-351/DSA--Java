package Chapter1Array.String;

public class ValidAnagram {
    // basically letters ko ulta seedha likh dena ulat palat kr dena letters ka
    public static boolean isAnagram(String s, String t){
        int s1 = s.length();
        int t1 = t.length();
        if(s1!=t1){
            return false;
        }
        int[] arr = new int[26];
        for (int i = 0; i<s.length(); i++){
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i<26; i++){
            if(arr[i]!= 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "car";
        String t = "arr";
        System.out.println(isAnagram(s,t));
    }
}
