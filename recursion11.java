public class recursion11 {
    public static void moveallx(String str, int idx, int count, String newstr){
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newstr += 'x';
            }
            System.out.println(newstr);
            return;
        }
        char currentchar = str.charAt(idx);
        if (currentchar == 'x') {
            count++;
            moveallx(str, idx+1, count, newstr);
        }else{
            newstr += currentchar;
            moveallx(str, idx+1, count, newstr);
        }
    }
    public static void main(String[] args) {
        String str = "axbdfdxxf";
        moveallx(str, 0, 0, "");
    }
}
