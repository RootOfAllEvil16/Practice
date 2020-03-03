import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter triangle sides: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        scanner.close();

        double perimeter = (a + b + c) / 2;
        double sqrt = Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c));
        System.out.println("Triangle sqrt =" + sqrt);
    }
}
