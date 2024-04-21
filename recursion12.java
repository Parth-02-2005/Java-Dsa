public class recursion12 {
    public static boolean[] map = new boolean[26];
    public static void removedup(String string, int idx, String newstr){
        if (idx == string.length()) {
            System.out.println(newstr);
            return;
        }
        char currentchar = string.charAt(idx);
        if (map[currentchar - 'a'] == true) {
            removedup(string, idx+1,newstr);
        }else{
            newstr += currentchar;
            map[currentchar - 'a'] = true;
            removedup(string, idx+1, newstr);
        }
    }
    public static void main(String[] args) {
        String string = "abbccda";
        removedup(string, 0, "");
    }
}
