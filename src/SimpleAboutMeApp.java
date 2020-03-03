import java.util.Scanner;

public class SimpleAboutMeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your surname: ");
        String surname = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        scanner.close();

        System.out.println("I`m " + name + " " + surname + ", " + age + " years old.");
    }
}
