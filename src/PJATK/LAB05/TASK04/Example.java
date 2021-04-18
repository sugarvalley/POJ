package PJATK.LAB05.TASK04;

public class Example {
    int age;
    int height;
    int weight;
    String name;
    String surname;

    public Example(int age, int height, int weight, String name, String surname) {
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Example{" +
                "age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
