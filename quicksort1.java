public class quicksort1 {
    public static int findelement(int arr[], int low, int high, int k){
        if (low<=high) {
            int pivotidx = parition(arr, low, high);
            if (pivotidx == k) {
                return arr[pivotidx];
            }else if(pivotidx > k){
                return findelement(arr, low, pivotidx-1, k);
            }else if(pivotidx < k){
                return findelement(arr, pivotidx+1, high, k);
            }
        }
        return -1;
    }
    public static int parition(int arr[], int low, int high){
       int pivot = arr[high];
       int i = low - 1;
       for (int j = low; j < high; j++) {
        if (arr[j] < pivot) {
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
       i++;
       int temp = arr[i];
       arr[i] = arr[high];
       arr[high] = temp;
       return i;
       
    }
    public static void main(String[] args) {
        int arr[] = {6,3,8,2,5};
        int k = 2;
        int result = findelement(arr, 0, arr.length-1, k);
        System.out.println(result);
    }
}

