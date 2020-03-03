package oop.Cat;

public class Cats {

    String name;
    String color;
    int age;


    public Cats(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void meow() {
        System.out.println("Meow");
    }
@Override
    public String toString() {
        return "Cats[name=" + name + ", age=" + age + ",color =" + color + "]";
    }
}
