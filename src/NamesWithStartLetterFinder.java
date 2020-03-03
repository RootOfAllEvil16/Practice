import java.util.ArrayList;
import java.util.Arrays;

public class NamesWithStartLetterFinder {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Phil", "Anny", "Aaron", "Bob"));
        System.out.println("Names with start letter A " + (namesWithStartLetter(names, 'A')));
    }

    public static ArrayList<String> namesWithStartLetter(ArrayList<String> names, char startLetter) {
        if (names.size() == 0) {
            throw new IllegalArgumentException("Empty list!");
        }
        //создаём новый дублирующий список и добавляем туда результат
        ArrayList<String> startNameLetter = new ArrayList<>();
        for (String name : names) {
            if (name.charAt(0) == startLetter) {
                startNameLetter.add(name);
            }
        }
        return startNameLetter;
    }

}
    /*Написать метод, находящий все имена, начинающиеся с буквы startLetter, в списке имен.
        Использовать цикл for-each.*/