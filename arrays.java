import java.util.*;
public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i = 0; i <size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter number to be searched:");
        int x = sc.nextInt();

        for(int i = 0; i<size; i++){
            if (arr[i]==x) {
                System.out.println(x+"found at index:"+i);
            }
        }
    }
}
