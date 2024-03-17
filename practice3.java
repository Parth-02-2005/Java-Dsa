import java.util.*;
public class practice3 {
    public static int greater(int a, int b){

        return Math.max(a, b);
        
    }
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a:");
        a = scanner.nextInt();
        System.out.println("Enter b:");
        b = scanner.nextInt();
        System.out.println(greater(a, b));
        
    }
}
