public class InvertedHalfPyramid {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the inverted half pyramid

        for (int i = rows; i >= 1; i--) { // Loop through each row
            for (int j = 1; j <= i; j++) { // Print stars in each row
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after each row
        }
    } 
}
