import java.util.Scanner;
public class Function {

    public static void greeting(String name) {
        System.out.println("Hello, " + name + "!");
        return;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        greeting(name);
        scanner.close();
    }
}
