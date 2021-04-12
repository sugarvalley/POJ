package PJATK.LAB05.TASK01;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Red", "Dog");
        Cat cat = new Cat("White", "Kitty");
        System.out.println(cat.makeSound());
        System.out.println(dog.makeSound());
    }
}
