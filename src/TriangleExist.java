import java.util.Scanner;

public class TriangleExist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side a: ");
        int a = scanner.nextInt();
        System.out.println("Enter side b: ");
        int b = scanner.nextInt();
        System.out.println("Enter side c: ");
        int c = scanner.nextInt();
        scanner.close();

        if (a > b + c || b > a + c || c > a + b) {
            System.out.println("Triangle is not exist");
        } else {
            System.out.println("Triangle exist");
        }
    }
}
