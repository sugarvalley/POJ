package PJATK.LAB05.TASK01;

public class Dog extends Animal {

    public Dog(String color, String name) {
        super(color, name);
    }

    public String makeSound() {
        return String.format("%s %s does WOOF!", color, name);
    }
}
