public class recursion_03 {
    public static int placetile(int n, int m){
        if (n <= m || n == m) {
            return 1;
        }
        int vertical = placetile(n-m, m);
        int horizontal = placetile(n-1, m);
        return vertical + horizontal;
    }
       public static void main(String[] args) {
        int n = 4;
        int m = 2;
        int ans = placetile(n, m);
        System.out.println(ans);

    }
}

