public class recursion08 {
    public static void stringreverse(String str, int index){
        if (index == 0) {
            System.out.println(str.charAt(index));
            return ;
        }
        System.out.println(str.charAt(index));
        stringreverse(str, index-1);
    }
    public static void main(String[] args) {
        String str = "parth";
        stringreverse(str, str.length()-1);
    }
}
