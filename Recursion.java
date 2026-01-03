public class Recursion {
    public static void main(String[] args) {
        int number = 5;
        PrintNumber(number);
    }
    public static void PrintNumber(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        PrintNumber(n - 1);
    }
}
