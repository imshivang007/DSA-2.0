public class NumberPyramid {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the number pyramid

        for (int i = 1; i <= rows; i++) { // Loop through each row
            // Print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print numbers in each row
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }

}
