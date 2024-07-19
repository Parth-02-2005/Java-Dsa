import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //add elements in arraylist

        list.add(0);
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        System.out.println(list);

        // get elements in arraylist

        int elements = list.get(1);
        System.out.println(elements);

        // add elements in between arraylist

        list.add(0, -1);
        System.out.println(list);

        // set elements in between arraylist

        list.set(0, 0);
        System.out.println(list);

        // remove element
        list.remove(3);

        // count size of array list 
        int size = list.size();
        System.out.println(size);

        //loops in array list 
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();

        //sorting
        Collections.sort(list);

    }
}
