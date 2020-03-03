import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month 1-12: ");
        int month = scanner.nextInt();
        scanner.close();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days in this months");
                break;
            case 2:
                System.out.println("28 days in this month");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days in this months");
                break;
            default:
                System.out.println("Error. Enter month 1-12!");
                System.exit(-1);

        }


    }
}
