import java.util.*;
public class practice8 {
    public static int square(int x, int y){
        int sq = 1;
        for(int i = 0; i < y; i++){
            sq = sq * x;
        }
        return sq;
    }

    public static void main(String[] args) {
        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a:");
        a = scanner.nextInt();
        System.out.println("Enter b:");
        b = scanner.nextInt();
        System.out.println(square(a, b));
    }
}
