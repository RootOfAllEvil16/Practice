import java.util.Scanner;

public class BiggerRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width1: ");
        int width1 = scanner.nextInt();
        System.out.println("Enter height1: ");
        int height1 = scanner.nextInt();
        System.out.println("Enter width2: ");
        int width2 = scanner.nextInt();
        System.out.println("Enter height2: ");
        int height2 = scanner.nextInt();
        scanner.close();

        int RectangleSqrt1 = width1 * height1;
        int RectangleSqrt2 = width2 * height2;

        if (width1 <= 0 | height1 <= 0 | width2 <= 0 | height2 <= 0) {
            System.out.println("Error. Side can`t be negative.");
            System.exit(-1);
        } else if (RectangleSqrt1 > RectangleSqrt2) {
            int BiggerRectangle = 1;
            System.out.println(BiggerRectangle);
        } else {
            int BiggerRectangle = 2;
            System.out.println(BiggerRectangle);
        }
    }
}
