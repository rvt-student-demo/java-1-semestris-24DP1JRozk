package rvt;    
import java.util.ArrayList;


public class App {

    static class Person {

        private final String name;
        private final String address;

        public Person(String name, String address) {
            this.name = name;
            this.address = address;
        }

        public String getName() {
            return this.name;
        }

        public String getAddress() {
            return this.address;
        }

        @Override
        public String toString() {
            return name + "\n  " + address;
        }
    }

    static class Student extends Person {

        private int credits;

        public Student(String name, String address) {
            super(name, address);
            this.credits = 0;
        }

        public int credits() {
            return this.credits;
        }

        public void study() {
            this.credits++;
        }

        @Override
        public String toString() {
            return getName() + "\n  " + getAddress() + "\n  Study credits " + credits;
        }
    }

    static class Teacher extends Person {

        private final int salary;

        public Teacher(String name, String address, int salary) {
            super(name, address);
            this.salary = salary;
        }

        @Override
        public String toString() {
            return getName() + "\n  " + getAddress() + "\n  salary " + salary + " euro/month";
        }
    }

    public static void printPersons(ArrayList<Person> persons) {
        for (Person p : persons) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

        printPersons(persons);
    }
}
