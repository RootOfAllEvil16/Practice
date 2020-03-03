public class Cat {

    public static void main(String[]args){
        // сперва нужно создать экземпляр класса (инстанцию)
        Cat cat = new Cat();
        //Переменную cat теперь можно использовать для вызова методов класса Cat
        cat.eat();
        cat.sleep();
        //Если метод возвращает какое-либо значение, например,
        // как наш метод speak() возвращает значение типа String, то его можно вызывать следующим образом:
        //объявить переменную такого же типа, что и возвращаемое значение (в нашем случае String)
        //присвоить ей вызванный метод, например:
        String say = cat.speak("Play with me");
        System.out.println(say);

    }
    //аттрибуты
    //к переменной можно обраатьсся только из её класса
    private int weight;
    private String name;
    private String color;

    //методы
    public void eat() {
        System.out.println("Eating...\n");
    }

    public void sleep() {
        System.out.println("Sleeping zzzzz...\n");
    }
//String — тип значения, которое возвращает метод.
// В предыдущих случаях ключевое слово void указывало на то, что метод ничего не возвращает.
// В данном случае  String  указывает на то, что метод возвращает значение типа строка.
    public String speak(String words){
        String phrase = words + "...meow...\n";
        return phrase;
    }
}
