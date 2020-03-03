public class Dog {
    public static void main(String[]args){
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        String say = dog.speak("Play with me");
        System.out.println(say);

    }
    public void eat(){
        System.out.println("Eating...\n");
    }
    public void sleep(){
        System.out.println("Sleeping zzzz...\n");
    }
    public String speak(String words){
        String phrase = words +" ...woof..\n";
        return phrase;
    }
}
