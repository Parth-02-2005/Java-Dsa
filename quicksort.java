public class quicksort {
    public static int parition(int arr[], int low, int high)  {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++; 
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }
    public static void quicksoort(int arr[], int low, int high){
        if (low < high) {
            int pivotidx = parition(arr, low, high);

            quicksoort(arr, low, pivotidx-1);
            quicksoort(arr, pivotidx+1, high);
        }

    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        int n = arr.length;
        quicksoort(arr, 0, n-1);
        //print
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]+" ");
        }
        
    }
}
