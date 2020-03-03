import java.util.Scanner;

public class Apt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter apt number: ");
        double apt = scanner.nextDouble();
        scanner.close();


        if (apt > 144 | apt <= 0) {
            System.out.println("There is no such apt number in this house");
        } else {
            double entrance = Math.ceil(apt / 36);
            double floor = Math.ceil((apt - (entrance - 1) * 36) / 4);
            System.out.println("floor " + floor);
            System.out.println("entrance " + entrance);
        }
    }

}
