import java.util.*;
public class practice1 {
    public static int avg(int num1, int num2, int num3){
        int sum = num1 + num2 + num3;
        int average = sum / 3;
        return average;
    }
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        System.out.println("The average of 3 numbers is:"+avg(a, b, c));
        scanner.close();

    }
}
