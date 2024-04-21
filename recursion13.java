public class recursion13 {
    public static void subsequences(String str, int idx, String newString){
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currentchar = str.charAt(idx);
        subsequences(str, idx+1, newString+currentchar);
        subsequences(str, idx+1, newString);
    }
    public static void main(String[] args) {
        String str = "abc";
        subsequences(str, 0, "");
    }
}
