import java.util.ArrayList;

public class recursion_05 {
    public static void printSubset(ArrayList<Integer> subsetArrayList){
        for (int i = 0; i < subsetArrayList.size(); i++) {
            System.out.println(subsetArrayList.get(i)+" ");
        }
          System.out.print("");
    }
    public static void findsubsets(int n, ArrayList<Integer> subsetArrayList){
        if (n == 0) {
            printSubset(subsetArrayList);
            return;
        }
        subsetArrayList.add(n);
        findsubsets(n-1, subsetArrayList);

        subsetArrayList.remove(subsetArrayList.size()-1);
        findsubsets(n-1, subsetArrayList);
    }
    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subsetArrayList = new ArrayList<>();
        findsubsets(n, subsetArrayList);
        
    }
}
