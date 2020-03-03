import java.util.ArrayList;
import java.util.Arrays;

public class LongestNameFinder {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Phil", "Anny", "Richard", "Chris"));
        System.out.println("Longest name in list is " + longestName(names));
        /*ArrayList<String> empty = new ArrayList<>();
        System.out.println(longestName(empty));*/

    }

    public static String longestName(ArrayList<String> names) {
        if (names.size() == 0) {
            throw new IllegalArgumentException("List is empty!");
        }

        String longestName = null;
        for (String name : names) {
            if(longestName == null||name.length() > longestName.length()) {
                longestName = name;

            }
        }
        return longestName;

    }
}

/*Task 1 (LongestNameFinder)
        Написать метод, находящий самое длинное имя пользователя в списке имен.
        Если список пустой, бросить исключение IllegalArgumentException.
        Использовать цикл for-each.*/
