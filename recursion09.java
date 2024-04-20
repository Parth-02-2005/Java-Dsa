public class recursion09 {
    public static int first = -1;
    public static int last = -1; 

    public static void findarr(String str, int idx, char element){
        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currchar = str.charAt(idx);
        if (currchar == element) {
            if (first == -1) {
                first = idx; 
            }else{
                last = idx;
            }
        }
        findarr(str, idx+1, element);
    }
    public static void main(String[] args) {
        String str = "abaacdaefaah";
        findarr(str, 0, 'a');
    }
}
