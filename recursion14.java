public class recursion14 {
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printcombo(String str, int idx, String combination){
        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }
        char currentchar = str.charAt(idx);
        String mappString = keypad[currentchar - '0'];
        for (int i = 0; i < mappString.length(); i++) {
            printcombo(str, idx+1, combination+mappString.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str = "23";
        printcombo(str, 0, "");
    }
}
