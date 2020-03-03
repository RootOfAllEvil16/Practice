import java.util.Scanner;

public class DifferentRadixSummator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter X in Bin: ");
        int x = scanner.nextInt(2);
        System.out.println(x);
        System.out.println("Enter Y in Oct: ");
        int y = scanner.nextInt(8);
        System.out.println(y);
        System.out.println("Enter Z in Hex: ");
        int z = scanner.nextInt(16);
        System.out.println(z);
        scanner.close();
        int result = x + y + z;
        System.out.println(result);
    }
}
