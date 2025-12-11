package rvt;


public class App {

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

        public Box(Box oldBox) {
            this.width = oldBox.width;
            this.height = oldBox.height;
            this.length = oldBox.length;
        }

        public double volume() {
            return width * height * length;
        }

        public double area() {
            return 2 * (width * height + width * length + height * length);
        }

        public double width() { return width; }
        public double height() { return height; }
        public double length() { return length; }
    }

    public static void main(String[] args) {

        Box original = new Box(2, 4, 6);
        Box copy = new Box(original);

        System.out.println("Original volume: " + original.volume());
        System.out.println("Copy volume: " + copy.volume());

        System.out.println("Copy dimensions: "
                + copy.width() + ", "
                + copy.height() + ", "
                + copy.length());
    }
}
