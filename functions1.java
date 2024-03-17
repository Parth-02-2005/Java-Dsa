import java.util.*;
public class functions1 {
    public static void fact(int n){
        int factorial = 1;
    for(int i = n; i>=1; i--){
        factorial = factorial * i;
    }
    System.out.println(factorial);
     return;
    }
    public static void main(String args[]){
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter num1:");
        int num1 = Scanner.nextInt();
        fact(num1);
    }
}
