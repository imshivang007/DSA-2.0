public class InvertedHalfPyramidRotated180Degree {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the inverted half pyramid rotated 180 degrees

        for (int i = 1; i <= rows; i++) { // Loop through each row
            // Print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            // Print stars in each row
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
