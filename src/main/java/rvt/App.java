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

        public double width() { return width; }
        public double height() { return height; }
        public double length() { return length; }

        public boolean nests(Box outside) {

            return this.width < outside.width
                && this.height < outside.height
                && this.length < outside.length;
        }
    }

    public static void main(String[] args) {

        Box small = new Box(3, 4, 5);
        Box big = new Box(5, 6, 7);

        System.out.println("Small fits in big: " + small.nests(big));
        System.out.println("Big fits in small: " + big.nests(small));
    }
}
