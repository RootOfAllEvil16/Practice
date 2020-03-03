import java.util.Scanner;

public class Mono {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double[][] x = new double[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                x[i][j] = in.nextDouble();
        if (n >= 1) {
            for (int i = 0; i < n; i++) {
 				/*последовательность монотонна, если сохраняет знак разность
            	между N-м и (N-1)-м членом последовательности.*/
                double prevSign = Math.signum(x[i][1] - x[i][0]); //знак разности первой пары чисел
                boolean monotonic = true;
                for (int j = 1; j < n; j++) {
                    double newSign = Math.signum(x[i][j] - x[i][j - 1]); //знак разности следующей пары
                    if (prevSign * newSign <= 0) {
                        monotonic = false;
                        j = n;
                    }
                    prevSign = newSign; //новая пара для сравнения
                }
                if (monotonic) System.out.println(i + 1);
            }
        } else System.out.println(1);
    }
}