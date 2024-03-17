import java.util.Scanner;

public class practice2 {
    public static void odd(int a){
        int sum = 0;
        for(int i = 1; i <= a; i+=2){
           sum += i;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int num1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number n:");
        num1 = scanner.nextInt();
        odd(num1);
    }
}
