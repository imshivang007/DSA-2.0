public class TowerOfHanoi {
    public static void solveTowerOfHanoi(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + source + " to rod " + destination);
            return;
        }
        solveTowerOfHanoi(n - 1, source, destination, auxiliary);
        System.out.println("Move disk " + n + " from rod " + source + " to rod " + destination);
        solveTowerOfHanoi(n - 1, auxiliary, source, destination);
    }
    public static void main(String[] args) {
        int n = 3; // Number of disks
        char source = 'S'; // Source rod
        char auxiliary = 'H'; // Auxiliary rod
        char destination = 'D'; // Destination rod

        System.out.println("Moves to solve Tower of Hanoi with " + n + " disks:");
        solveTowerOfHanoi(n, source, auxiliary, destination);
        
    }
}