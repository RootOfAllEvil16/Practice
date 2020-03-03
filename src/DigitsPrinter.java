public class DigitsPrinter {
    public static void main(String[] args) {
        int n = 24;

        System.out.println(n % 100000 / 10000);
        System.out.println(n % 10000 / 1000);
        System.out.println(n % 1000 / 100);
        System.out.println(n % 100 / 10);
        System.out.println(n % 10);
    }
}
