import java.util.Scanner;

public class BmiInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weight in kg: ");
        double weight = scanner.nextDouble();
        System.out.println("Enter height in m: ");
        double height = scanner.nextDouble();
        scanner.close();

        double bmi = weight / Math.pow(height, 2);

        if (weight <= 0 | height <= 0) {
            System.out.println("Error!");
            System.exit(-1);
        } else if (bmi <= 18.5) {
            System.out.println("Underweight");
        } else if (bmi > 18.15 && bmi <= 25.0) {
            System.out.println("Normal");
        } else {
            System.out.println("Overweight. You fat ass");
        }
    }
}
