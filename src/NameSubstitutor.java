import java.util.Scanner;


public class NameSubstitutor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        scanner.close();

        String message = "Hi, my name is ${name}";
        String newMessage = message.replace("${name}", name);
        System.out.println(newMessage);


    }
}
