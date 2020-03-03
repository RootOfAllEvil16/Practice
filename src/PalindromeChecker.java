import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("String s: ");
        String s = scanner.next();
        scanner.close();

        int len = s.length();
        boolean isPalindrome = false;

        for (int n = 0; n < len / 2; n++) {
            if (s.charAt(n) == s.charAt(len - 1 - n)) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
            }
            break;
        }
        System.out.println(isPalindrome);


    }
}
