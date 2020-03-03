import java.util.Scanner;

public class Apt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter aprt number: ");
        int aprt = scanner.nextInt();
        scanner.close();

        int floorTotal = 9;
        int entranceTotal = 4;
        int aprtPerFloor = 4;
        int aprtInEntrance = floorTotal * aprtPerFloor;
        int aprtTotal = ((floorTotal * aprtPerFloor) * entranceTotal);


        if (aprt > aprtTotal || aprt < 1) {
            System.out.println("There is no such aprt in this house");
        } else {
            int entrance = (aprt - 1) / aprtTotal + 1;
            int floor = ((aprt - 1) % aprtInEntrance) / aprtPerFloor + 1;
            System.out.println("entrance " + entrance);
            System.out.println("floor " + floor);

        }

    }
}
