package oop.Triangle;

public class Main {
    public static void main(String[] args) {
        Triangle triangleOne = new Triangle(2,3,5);
        System.out.println(triangleOne);
        System.out.println("The area is - " + triangleOne.calculationArea());
        Triangle triangleTwo = new Triangle();
        triangleTwo.setSideA(5);
        triangleTwo.setSideB(6);
        triangleTwo.setSideC(7);
        System.out.println("The area is - " + triangleTwo.calculationArea());

    }
}
