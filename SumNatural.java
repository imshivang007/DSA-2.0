import java.util.Scanner;

public class SumNatural {
    static void sum(int n, int sum){
        if(n==0){
            System.out.println("Sum of natural numbers: " + sum);
            return;
        }
        sum(n-1, sum + n);
    }


    public static void main(String ar[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        int sum=0;
        sum(n,sum);
        
    }
}
