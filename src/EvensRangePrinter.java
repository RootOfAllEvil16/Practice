import java.util.Scanner;

public class EvensRangePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int first = scanner.nextInt();
        System.out.println("Enter last number: ");
        int last = scanner.nextInt();
        scanner.close();

        if (first <= last) {
            for (int n = first; n <= last; n++) {
                //если целое число
                if (n % 2 == 0) {
                    System.out.println(n + "");
                }
            }
        }
    }
}
