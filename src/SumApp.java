import java.util.Scanner;

public class SumApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int n = scanner.nextInt();

        int sum = 0;

        while (n != 0) {
            sum = sum + n;
            System.out.println("Enter number: ");
            n = scanner.nextInt();

        }
        System.out.println("sum = " + sum);
    }
}
