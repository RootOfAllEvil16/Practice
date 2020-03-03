import java.util.Scanner;

public class IsPointInCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radius = 4;
        System.out.println("Enter point x: ");
        double x = scanner.nextDouble();
        System.out.println("Enter point y: ");
        double y = scanner.nextDouble();
        scanner.close();
        if (x * x + y * y < radius * radius){
            System.out.println("Point is inside circle");
        }
        else {
            System.out.println("Point is not inside circle");
        }

    }
}
