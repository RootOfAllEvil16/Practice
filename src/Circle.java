import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter radius of circle: ");
        double radius = scanner.nextDouble();

        double length = Math.PI * radius * 2;
        System.out.println("Length of circle =" + length);
    }
}
