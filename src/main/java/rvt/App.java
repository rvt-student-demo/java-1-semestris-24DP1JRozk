package rvt;

public class App {
    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 4, 2};
        System.out.println(sumOfNumbersInArray(arr));
    }

    public static int sumOfNumbersInArray(int[] array) {
        int sumVar = 0;
        for (int i = 0; i < array.length; i++) {
            sumVar = sumVar + array[i];
        }
        return sumVar;
    }
}

