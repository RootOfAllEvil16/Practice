import java.util.Scanner;

public class LoopFromTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number from: ");
        int numFrom = scanner.nextInt();
        System.out.println("Enter number to: ");
        int numTo = scanner.nextInt();
        scanner.close();

        for (int i = numFrom; i <= numTo; i++) {
            System.out.println(i + "");
        }
    }
}
