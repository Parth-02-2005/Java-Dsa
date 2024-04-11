public class recursion04 {
    public static int fact(int n){
        if (n == 1 || n == 0) {
            return 1;
        }
        int fact1 =   fact(n-1);
        int fact2 = n * fact1;
        return  fact2;
    }
    public static void main(String[] args) {
        int n = 5; 
        int fact03 = fact(n);
        System.out.println(fact03);
    }
}
