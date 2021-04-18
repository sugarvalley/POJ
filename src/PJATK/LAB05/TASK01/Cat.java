package PJATK.LAB05.TASK01;

public class Cat extends Animal {

    public Cat(String color, String name) {
        super(color, name);
    }

    public String makeSound() {
        return String.format("%s %s does MEOW!", color, name);
    }
}
