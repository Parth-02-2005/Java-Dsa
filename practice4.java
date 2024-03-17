import java.util.Scanner;

public class practice4 {
    public static Double circle(Double r){
        Double pi = 3.14;
        Double area = pi * r * r;
        return area;
    }
    public static void main(String[] args) {
        Double r;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter r:");
        r = scanner.nextDouble();
        System.out.println(circle(r));
    }
}
