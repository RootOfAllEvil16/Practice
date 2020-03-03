import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String args[]) {
        int counter, num, item, array[], first, last;

        //создаю объект Scanner для считывания введенных чисел
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of array elements:");
        num = scanner.nextInt(); //считает введенное число с консоли

        //создаю массив введенного мной размера
        array = new int[num];
        System.out.println("Enter " + num + " integers");

        //заполняю массив вводя элементы в консоль
        for (counter = 0; counter < num; counter++)
            array[counter] = scanner.nextInt();

        //СОРТИРУЕМ ЭЛЕМЕНТЫ МАССИВА ДЛЯ БИНАРНОГО ПОИСКА
        Arrays.sort(array);

        System.out.println("Enter element for binary search:");
        item = scanner.nextInt();
        first = 0;
        last = num - 1;

        //метод принимает начальный, последний индекс и искомое число
        binarySearch(array, first, last, item);
    }

    //Бинарный поиск
    public static void binarySearch(int[] array, int first, int last, int item) {
        int position;
        int comparisonCount = 1; //считаем количество сравнений

        //ищем индекс среднего элемента массива
        position = (first + last) / 2;

        while ((array[position] != item) && (first <= last)) {
            comparisonCount++;
            if (array[position] > item) {//если получаем проблему
                last = position - 1;//уменьшаем позицию на 1
            } else {
                first = position + 1;//увеличиваем позицию на 1
            }
            position = (first + last) / 2;
        }
        if (first <= last) {
            System.out.println(item + " is " + ++position + " element in array");
            System.out.println("Binary search found integer after " + comparisonCount + " comparisons");
        } else {
            System.out.println("Element not found in array. Binary search stopped after " + comparisonCount + " comparisons");
        }
    }
}

