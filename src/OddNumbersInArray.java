
public class OddNumbersInArray {
    public static void main(String[] args) {
        int[] a = new int[]{0, 5, 2, 4, 7, 1, 3, 19};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                sum++;


            }
        }
        System.out.println("Count of positive elements " + sum + "");
    }
}
