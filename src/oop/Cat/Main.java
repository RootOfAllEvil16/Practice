package oop.Cat;

public class Main {
    public static void main(String[] args) {
        Cats catOne = new Cats("First",1,"black");
        Cats catTwo = new Cats("Second",2,"white");
        Cats catThree = new Cats("Third",3,"ginger");
        System.out.println(catOne);
        System.out.println(catTwo);
        System.out.println(catThree);
        catThree.meow();
    }
}
