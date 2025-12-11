package rvt;


public class App {
    public static void main(String[] args) {
        Person alice = new Person("Alice");
        System.out.println(alice);

        alice.setHeight(170);
        alice.setWeight(65);
        alice.growOlder();
        System.out.println(alice);

        Person bob = new Person("Bob", 25, 180, 75);
        System.out.println(bob);
        System.out.println(bob.getName() + " is adult? " + bob.isAdult());

        bob.setWeight(78);
        System.out.println(bob);
    }
}

class Person {
    private final String name;
    private int age;
    private int height;
    private int weight;

    public Person(String name) {
        this(name, 0, 0, 0);
    }

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public void setHeight(int height) {
        if (height >= 0) this.height = height;
    }

    public void setWeight(int weight) {
        if (weight >= 0) this.weight = weight;
    }

    public void growOlder() {
        age++;
    }

    public boolean isAdult() {
        return age >= 18;
    }

    public double bodyMassIndex() {
        if (height <= 0) return 0;
        double heightInMeters = height / 100.0;
        return weight / (heightInMeters * heightInMeters);
    }

    @Override
    public String toString() {
        return name + " is " + age + " years old" +
               (height > 0 && weight > 0 ? ", BMI: " + String.format("%.2f", bodyMassIndex()) : "");
    }
}
