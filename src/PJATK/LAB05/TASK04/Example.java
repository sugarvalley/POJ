package PJATK.LAB05.TASK04;

public class Example {
    private int age;
    private int height;
    private int weight;
    private String name;
    private String surname;

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
