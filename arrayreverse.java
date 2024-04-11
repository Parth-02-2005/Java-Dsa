public class arrayreverse {
    public static int reverse(int arr[]){
        
        for(int i = 0; i<=arr.length-1; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1];
            arr[arr.length-1] = temp;
            reverse(arr);
    }
    public static void main(String[] args) {
        int arr[] = {4,3,2,1};
            reverse(arr[]);
        }
        
    }
}
