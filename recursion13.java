import java.util.HashSet;

public class recursion13 {
    public static void subsequences(String str, int idx, String newString, HashSet<String> set){
        if (idx == str.length()) {
            if (set.contains(newString)) {
                return;
            }else
            {
                System.out.println(newString);
                set.add(newString);
            }
            System.out.println(newString);
            return;
        }
        char currentchar = str.charAt(idx);
        subsequences(str, idx+1, newString+currentchar,set);
        subsequences(str, idx+1, newString,set);
    }
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        String str = "aaa";
        subsequences(str, 0, "", set);
    }
}
