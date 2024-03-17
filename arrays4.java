import java.util.*;
public class arrays4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows:");
        int a = sc.nextInt();
        System.out.println("Enter cols:");
        int b = sc.nextInt();

        int[][] matrix = new int[a][b];

        System.out.println("Enter elements:");
        for(int i = 0; i<a; i++){
            for(int j = 0; j<b; j++){
                 matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements to be searched:");
        int c = sc.nextInt();
            System.out.println("Printing elements");
        for(int i = 0; i<a; i++){
            for(int j = 0;  j<b; j++){
                if (c == matrix[i][j]) {
                    System.out.println("the number"+ c + "found at index:" + i + "," + j);
                    
                }
                
            }
            System.out.println();
        }
        sc.close();
    }
}
