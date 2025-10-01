package rvt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter low: ");
        int startV = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter high: ");
        int endV = Integer.valueOf(scanner.nextLine());

        scanner.close();

        int intSum = 0;

        for (int i = startV; i < endV + 1; i++) {
            intSum = intSum + i;          
        }

        System.out.println("Sum: " + intSum);
    }
}
