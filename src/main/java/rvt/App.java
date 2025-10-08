package rvt;

public class App {
    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 4, 2};
        printStars(arr);
    }

    public static void printStars(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

