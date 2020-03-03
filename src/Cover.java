import java.util.Scanner;

public class Cover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of horizontal lines: ");
        int hlines = scanner.nextInt();
        System.out.println("Enter number of vertical lines: ");
        int vlines = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= hlines; i++) {
            for (int j = 1; j <= vlines; j++) {
                if (j % 2 == 0) {
                    System.out.print("+++");
                } else {
                    System.out.print("***");
                }
            }
            System.out.println();
        }
    }
}