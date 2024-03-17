public class arrays3 {
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        int arr[] = {10,20,30,40,50,60};
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == max) {
                System.out.println("max value is:"+arr[i]);
            }
             if (arr[i] == min) {
                System.out.println("min value is:"+arr[i]);
            }
        }
    }
}
