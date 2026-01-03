public class ReverseStrings {
    public static void main(String[] args) {
        String original = "Hello, World!";
        int idx = original.length() - 1;

        ReverseString(original,idx);
    }
    public static void ReverseString(String str, int index) {
        if (index < 0) {
            return;
        }
        System.out.print(str.charAt(index));
        ReverseString(str, index - 1);
    }
}
