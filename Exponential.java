public class Exponential {
    public static void main(String[] args) {
        int base = 2;
        int exponent = 3;
        int result = power(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }
    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if(base == 0) {
            return 0;
        }
        return base * power(base, exponent - 1);
    }
}
