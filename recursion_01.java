public class recursion_01 {
    public static void permutations(String string, String permutationsString){
        if (string.length() == 0) {
            System.out.println(permutationsString);
            return;
        }
        for (int i = 0; i < string.length(); i++) {
            char currentchar = string.charAt(i);
            String newString = string.substring(0, i) + string.substring(i+1);
            permutations(newString, permutationsString+currentchar);
        }
    }
    public static void main(String[] args) {
        String string = "abc";
        permutations(string, "");
    }
}
