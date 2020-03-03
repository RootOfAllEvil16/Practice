package Marathon;

public class LoopsFor50 {
    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        int k = 1;
        do {
            System.out.print(k + " ");
            k++;
        } while (k <= 50);

        System.out.println();

        int n = 1;
        while (n <= 50) {
            System.out.print(n + " ");
            n++;
        }
    }
}
