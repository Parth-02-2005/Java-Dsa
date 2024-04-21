public class recursion10 {
    public static boolean isSorted(int arrary[] ,int idx){
        if (idx == arrary.length-1) {
            return true;
        }
        if (arrary[idx] >= arrary[idx+1]) {
           return false;
        }
        return  isSorted(arrary, idx+1);
    }
    public static void main(String[] args) {
        int arrary[] = {2,3,4,5,5};
        System.out.println(isSorted(arrary, 0));
    }
}
