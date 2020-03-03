import java.util.Scanner;

public class LessNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number a: ");
        int a = scanner.nextInt();
        System.out.println("Enter number b: ");
        int b = scanner.nextInt();
        scanner.close();

        if (a < b) {
            System.out.println("Number a lesser then b");
        } else if (b < a) {
            System.out.println("Number b is lesser then a");
        }
        else {
            System.out.println("Number a and number b are equal");
        }

    }
}
