import java.util.LinkedList;

public class LinkedListUsingCollectionFramework {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        System.out.println(list);
        list.addFirst("Mango");
        System.out.println(list);
        list.addLast("Orange");
        System.out.println(list);
        System.out.println("Size of the linked list: " + list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");
        }
            System.out.print("null");

        list.removeFirst();
        list.removeLast();
        System.out.println("\nAfter removing first and last elements: " + list);
    }
}
