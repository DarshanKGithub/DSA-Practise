import java.util.ArrayList;

public class ArrayListAdd {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Add and element - O(1)

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1, 50);

        System.out.println(list.size());

        // iterating print the array list
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // System.out.println(list);
        // System.out.println(list.size());

        // Get Operation - O(1)
        // int element = list.get(2);
        // System.out.println(element);

        // Delete - O(n)
        // list.remove(2);
        // System.out.println(list);

        // Set element at index - O(n)
        // list.set(2, 10);
        // System.out.println(list);

        // Contains
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(11));
    }
}
