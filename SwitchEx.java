import java.util.Scanner;

public class SwitchEx {
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 3:");
        int num = sc.nextInt();
        switch(num){
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("namaste");
                break;
            case 3:
                System.out.println("bonjour");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }

    }
}
