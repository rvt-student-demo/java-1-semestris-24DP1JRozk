package rvt;


public class App {

    // Immutable Box class
    static class Box {

        private final double width;
        private final double height;
        private final double length;

        public Box(double width, double height, double length) {
            this.width = width;
            this.height = height;
            this.length = length;
        }

        public Box(double side) {
            this.width = side;
            this.height = side;
            this.length = side;
        }

        public double volume() {
            return width * height * length;
        }

        public double area() {
            return 2 * (width * height + height * length + width * length);
        }
    }

    public static void main(String[] args) {

        Box box = new Box(2.5, 5.0, 6.0);

        System.out.println("\nArea: " + box.area()
                + " volume: " + box.volume());

        System.out.println("Works. Box is properly encapsulated.");
    }
}
