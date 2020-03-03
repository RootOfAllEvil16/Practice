import java.util.Scanner;

public class Apt3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter aprt number: ");
        int aprt = scanner.nextInt();
        scanner.close();

        if (aprt > 0 && aprt <= 144){
            int entrance =( aprt - 1) / 36 + 1;
            int floor =( aprt- 36 * ( entrance - 1 ) - 1 )/4 + 1;
            System.out.println("entrance " + entrance);
            System.out.println("floor " + floor);
        }
        else {
            System.out.println("There is no such aprt in this house");
        }

    }
}
