package ForInterview;

public class ReverseStrArray {


    public static void main(String[] args) {
        //инициализируем строку
        String s = "Reverse this";
        //конвертим строку в массив с помощью toCharArray
        char[] symbols = s.toCharArray();
        //используем цикл for и берём символы в обратном порядке
        for (int x = symbols.length - 1; x >= 0; x--) {

            System.out.print(symbols[x]);
        }
    }
}

    /*Напишите программу на Java для переворота последовательности символов в строке
    без использования встроенной в String функции reverse().*/