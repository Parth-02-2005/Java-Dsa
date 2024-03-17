import java.util.Scanner;

public class practice5 {
    public static int age (int person){
        if (person >= 18) {
            System.out.println("Congrulations you can vote.");
        }else{
            System.out.println("Sorry! you are not eligible.");
        }
        return person;
    }
    public static void main(String[] args) {
        int person;
        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter your age:");
        person = scaner.nextInt();
        age(person);
        scaner.close();
    }
}
