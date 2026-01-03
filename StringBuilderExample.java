public class StringBuilderExample {
    public static void main(String[] args) {
        // Create a StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        // Append a string to the StringBuilder
        sb.append(" World");
        System.out.println("After append: " + sb.toString());

        // Insert a string at a specific index
        sb.insert(5, ",");
        System.out.println("After insert: " + sb.toString());

        // Replace a substring with another string
        sb.replace(7, 12, "Java");
        System.out.println("After replace: " + sb.toString());

        // Delete a substring
        sb.delete(5, 6);
        System.out.println("After delete: " + sb.toString());

        // Reverse the StringBuilder content
        sb.reverse();
        System.out.println("After reverse: " + sb.toString());
    }
}
