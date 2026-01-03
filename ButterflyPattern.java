public class ButterflyPattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the butterfly pattern

        // Upper half of the butterfly
        for (int i = 1; i <= rows; i++) {
            // Print left wing
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Print spaces between wings
            for (int j = 1; j <= 2 * (rows - i); j++) {
                System.out.print("  ");
            }
            // Print right wing
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after each row
        }

        // Lower half of the butterfly
        for (int i = rows; i >= 1; i--) {
            // Print left wing
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Print spaces between wings
            for (int j = 1; j <= 2 * (rows - i); j++) {
                System.out.print("  ");
            }
            // Print right wing
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
