public class recursion07 {
    public static void towerofhanoi(int n, String source, String helper, String destnation){
        if (n == 1) {
            System.out.println("transfer disk" + n + "from"+source+"to"+destnation);
            return;
        }
        towerofhanoi(n-1, source, destnation, helper);
        System.out.println("transfered from source"+source+"to helper"+destnation);
        towerofhanoi(n-1, helper, source, destnation);
    }
    public static void main(String[] args) {
        int n = 3;
        towerofhanoi(n, "S", "H", "D");
    }
}
