import java.util.Scanner;

public class Range {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n:  ");
        int n = scanner.nextInt();
        scanner.close();

        if (n >= 100 && n <= 200) {
            System.out.println("n is in range between 100...200");
        } else {
            System.out.println("n is NOT in range between 100...200");
        }
    }
}
