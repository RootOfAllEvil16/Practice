import java.util.Scanner;

public class RangePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int first = scanner.nextInt();
        System.out.println("Enter last number: ");
        int last = scanner.nextInt();
        scanner.close();

        if (first <= last) {
            for (int n = first; n <= last; n++) {
                System.out.println(n + "");
            }

        } else {
            for (int n = first; n >= last; n--) {
                System.out.println(n + "");
            }
        }

    }
}
