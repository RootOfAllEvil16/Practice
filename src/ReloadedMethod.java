public class ReloadedMethod {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        System.out.println(sum(a, b));
        System.out.println(sum(1, 2, 3));
    }

    public static int sum(int a, int b) {
        int c = a + b;
        return c;
    }

    public static int sum(int a, int b, int c) {

        return a + b + c;
    }
}
