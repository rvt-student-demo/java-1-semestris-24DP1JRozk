package rvt;


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

    public static void main(String[] args) {

        Student ollie = new Student(
            "Ollie",
            "6381 Hollywood Blvd. Los Angeles 90028"
        );

        System.out.println(ollie);

        ollie.study();

        System.out.println(ollie);
    }
}
