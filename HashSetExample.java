import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample{
    public static void main(String[] args){
        HashSet<String> fruits = new HashSet<>();

        // Adding elements to the HashSet
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        System.out.println("Fruits in the HashSet: " + fruits);

        //Size of the HashSet
        int size = fruits.size();
        System.out.println("Size of the HashSet: " + size);

        // Checking if an element exists in the HashSet
        if(fruits.contains("Banana")){
            System.out.println("Banana is present in the HashSet.");
        } else {
            System.out.println("Banana is not present in the HashSet.");
        }

        //Deleting an element from the HashSet
        fruits.remove("Orange");
        System.out.println("Updated Fruits in the HashSet: " + fruits);

        // Iterating through the HashSet
        System.out.println("Iterating through the HashSet:");
        Iterator iterator = fruits.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}