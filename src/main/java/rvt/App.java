package rvt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter N: ");
        int startN = Integer.valueOf(scanner.nextLine());

        scanner.close();

        int nSum = 0;

        for (int i = 0; i < startN + 1; i++) {
            nSum = nSum + i;         
        }

        System.out.println("Sum = " + nSum);
        System.out.println("Formula = " + (startN * (startN + 1)) / 2);
    }
}
