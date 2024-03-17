import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First name:");
        String nameString = sc.nextLine();
        System.out.println("Enter your second name:");
        String secoString = sc.nextLine();
        String fulString = nameString + " "+ secoString;
        System.out.println("Your name is:"+ nameString);
        System.out.println("your name is:"+secoString);
        System.out.println("your full name is:"+fulString.length());
        for(int i = 0; i<fulString.length(); i++){
            System.out.println(fulString.charAt(i));
        }
        if (nameString.compareTo(secoString) == -1) {
            System.out.println("String are equal.");
        }else
        System.out.println("Strings are not equal.");
    }
}
