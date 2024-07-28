import java.util.LinkedList;
import java.util.Scanner;

public class linkedlist03 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements:");
        while (true) {
        
            int input = scanner.nextInt();
            if (input == -1) {
                System.out.println("Invalid input");
                break;
            }
            if (input >=1 || input <= 50) {
                list.add(input);
            }else{
                System.out.println("Enter number between 1 to 50");
            }
            
        }
        System.out.println("Original list:" +list);
        list.removeIf(n -> n > 25);
        System.out.println("Flitered list:" + list);
        scanner.close();
    }
}
