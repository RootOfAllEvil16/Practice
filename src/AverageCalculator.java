public class AverageCalculator {
    public static void main(String[] args) {
        int a = 1000000000;
        int b = 2000000000;
        int avg = (a / 2 + b / 2) + (a % 2 + b % 2)/2;
                System.out.println("avg =" + avg);
    }
}
