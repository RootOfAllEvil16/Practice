package ForInterview;

import java.util.Scanner;

public class ReverseStrArrayScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        System.out.println("Enter your string");
        s = scanner.nextLine();
        String[] temp = s.split("");
        for (int x = temp.length - 1; x >= 0; x--) {
            System.out.println(temp[x] + "");
        }
    }
}
