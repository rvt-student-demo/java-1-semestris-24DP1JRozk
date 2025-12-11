package rvt;


public class App {

    static class Person {

        private final String name;
        private final String address;

        public Person(String name, String address) {
            this.name = name;
            this.address = address;
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
    }

    public static void main(String[] args) {

        Student ollie = new Student(
            "Ollie",
            "6381 Hollywood Blvd. Los Angeles 90028"
        );

        System.out.println(ollie);
        System.out.println("Study credits " + ollie.credits());

        ollie.study();

        System.out.println("Study credits " + ollie.credits());
    }
}
