import java.util.Scanner;

public class TrianglePoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coords of point x: ");
        double x = scanner.nextDouble();
        System.out.println("Enter coords of point y: ");
        double y = scanner.nextDouble();
        scanner.close();

        double xA = 0;
        double yA = 0;
        double xB = 4;
        double yB = 4;
        double xC = 6;
        double yC = 1;

        double d1 = (xA - x) * (yB - yA) - (xB - xA) * (yA - y);
        double d2 = (xB - x) * (yC - yB) - (xC - xB) * (yB - y);
        double d3 = (xC - x) * (yA - yC) - (xA - xC) * (yC - y);

        if  ((d1 >= 0 && d2 >= 0 && d3 >= 0) || (d1 <= 0 && d2 <= 0 && d3 <= 0)){
            System.out.println("Point lay in triangle");
        }
        else {
            System.out.println("Point is not lay in triangle");
        }


    }
}
