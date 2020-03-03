import java.util.Scanner;

public class CountMax3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxElement = Integer.MIN_VALUE;
        int countMaxElements = 1;
        int element;
        System.out.println("Вводите данные, для завершения введите -1");
        do {
            element = scanner.nextInt();
            if (element == maxElement) {
                countMaxElements++;
                System.out.println("элемент равен максимальному");
            } else if (element > maxElement) {
                maxElement = element;
                countMaxElements = 1;
                System.out.println("Найден новый максимальный элемент!");
            }
        } while (element != -1);

        System.out.println("MaxElement: " + maxElement + " встретился раз: " + countMaxElements );
    }
}
