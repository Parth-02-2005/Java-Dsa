import java.util.Scanner;

public class practice9 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter num1:");
       int n1 = sc.nextInt();
       System.out.println("Enter num2:");
       int n2 = sc.nextInt();

       while(n1 != n2) { 
           if(n1>n2) {
               n1 = n1 - n2;
           } else {
               n2 = n2 - n1;
           }
       }
       System.out.println("GCD is : "+ n2);
    }
}
