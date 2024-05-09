import java.util.ArrayList;

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
    }
}
