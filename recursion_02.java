public class recursion_02 {
    public static int countpaths(int i , int j, int n, int m){
        if (i == n && j == m) {
            return 0;
        }
        if (i == n-1 || j == m-1) {
            return 1;
        }
        int downmove = countpaths(i+1, j, n, m);
        int rightmove = countpaths(i, j+1, n, m);
        return downmove + rightmove;
    }
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        int totalpaths = countpaths(0, 0, n, m);
        System.out.println(totalpaths);

    }
}
