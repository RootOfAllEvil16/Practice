package Ex;

public class MinMaxAvg {
    public static void main(String[] args) {
        int n = 100;
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        double min = array[0];
        double max = array[0];
        double avg = 0;
        for (int i = 0; i < array.length; i++) {
            double v = array[i];
            if (max < v) {
                max = v;
            }
            if (min > v) {
                min = v;
            }
            avg += v / array.length;
        }
        System.out.println("max " + max);
        System.out.println("min " + min);
        System.out.println("avg " + avg);
    }
}
