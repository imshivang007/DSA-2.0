public class BitManipulation {
    // Method to check if the bit at 'position' in 'number' is set (1) or not (0)
    public static void main(String[] args) {
        int number = 5; // Example number (binary 0101)

        // Check Bit Example
        int position = 2; // Example bit position to check (0-indexed)
        int mask = 1 << position; // Create a mask by shifting 1 to the left 'position' times
        boolean isSet = (number & mask) != 0; // Use bitwise AND
        System.out.println("Is bit at position " + position + " set? " + isSet);

        //Set Bit Example
        position = 1; // Example bit position to set (0-indexed)
        int mask2 = 1 << position; // Create a mask by shifting 1 to the left 'position' times
        int newNumber = number | mask2; // Use bitwise OR to set the bit
        System.out.println("Number after setting bit at position " + position + ": " + newNumber);
    
        //Clear Bit Example
        position = 2; // Example bit position to clear (0-indexed)
        int mask3 = ~(1 << position); // Create a mask by shifting 1 to the left 'position' times and negating it
        int clearedNumber = number & mask3; // Use bitwise AND to clear the bit
        System.out.println("Number after clearing bit at position " + position + ": " + clearedNumber);
    
        //Update Bit Example
        position = 0; // Example bit position to update (0-indexed)
        int value = 1; // New value to set (0 or 1)
        int mask4 = 1 << position; // Create a mask by shifting 1 to the left 'position' times
        int updatedNumber = (number & ~mask4) | (value << position); //
        System.out.println("Number after updating bit at position " + position + " to " + value + ": " + updatedNumber);
    }
}
