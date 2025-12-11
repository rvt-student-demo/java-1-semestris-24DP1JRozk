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

        public Box biggerBox(Box oldBox) {
            return new Box(1.25 * oldBox.width,
                           1.25 * oldBox.height,
                           1.25 * oldBox.length);
        }

        public Box smallerBox(Box oldBox) {
            return new Box(0.75 * oldBox.width,
                           0.75 * oldBox.height,
                           0.75 * oldBox.length);
        }
    }

    public static void main(String[] args) {

        Box base = new Box(4, 6, 8);
        Box big = base.biggerBox(base);
        Box small = base.smallerBox(base);

        System.out.println("Base volume: " + base.volume());
        System.out.println("Bigger box volume: " + big.volume());
        System.out.println("Smaller box volume: " + small.volume());
    }
}
