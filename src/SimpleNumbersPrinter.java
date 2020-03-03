public class SimpleNumbersPrinter {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j <= 100; j++) {
                if (i % j == 0 & i != j) {
                    break;

                } else if (i != j) {
                    continue;
                }
                else {
                    System.out.println(i);
                }
            }
        }
    }
}