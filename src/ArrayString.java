import java.util.Scanner;

public class ArrayString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = scanner.nextLine();
        char[] t = text.toCharArray();
        int sum = 0;

        for (int i = 0; i < t.length; i++) {
            if (t[i] == 'b' || t[i] == 'B') {
                sum++;
            }

        }
        System.out.println("Number of letter 'b' in this text = " + sum);
    }
}
