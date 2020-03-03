import java.util.Scanner;

public class CharsCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("String s: ");
        String s = scanner.nextLine();
        int count = 0;
        System.out.println("String ch: ");
        String symbol = scanner.next();
        char ch = symbol.charAt(0);
        int len = s.length();
        scanner.close();

        for (int n = 0; n < len; n++) {
            if (s.charAt(n) == ch) {
                count++;
            }
        }
        System.out.println(count);
    }
}
