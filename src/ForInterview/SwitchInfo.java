package ForInterview;

import java.util.Scanner;

public class SwitchInfo {
    public static void main(String[] args) {
        //переменные. a,b и третья для обмена
        int a, b, temp;
        System.out.println("Enter a and b");
        //сканнер
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("Before switch " + a + b);
        //обмен значениями
        temp = a;
        a = b;
        b = temp;
        System.out.println("After switch "+ a + b);
    }
}
    /*Напишите программу на Java для того, чтобы поменять местами значения,
        хранящиеся в двух переменных с помощью третьей переменной*/