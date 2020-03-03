import java.util.Scanner;

public class FunctionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x: ");
        double x = scanner.nextDouble();
        scanner.close();

        double f = Math.log(Math.sin(x) + Math.exp(x) * Math.sqrt(x) / Math.PI);
        System.out.println("f(x)=" + f);

    }
}
