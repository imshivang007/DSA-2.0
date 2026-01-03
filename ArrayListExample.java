import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList to hold String elements
        ArrayList<String> list = new ArrayList<>();

        // Add elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Print the ArrayList
        System.out.println("ArrayList: " + list);

        // Access an element by index
        String fruit = list.get(1);
        System.out.println("Element at index 1: " + fruit);

        // Update an element
        list.set(2, "Date");
        System.out.println("ArrayList after update: " + list);

        // Remove an element
        list.remove("Banana");
        System.out.println("ArrayList after removal: " + list);

        // Iterate through the ArrayList
        System.out.println("Iterating through the ArrayList:");
        for (String item : list) {
            System.out.println(item);
        }

        //Size of the ArrayList
        System.out.println("Size of the ArrayList: " + list.size());

        //Sort the ArrayList
        list.sort(null);
        System.out.println("Sorted ArrayList: " + list);
    }
}
