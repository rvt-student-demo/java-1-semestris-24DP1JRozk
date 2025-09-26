package rvt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Counter!\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input numbers, to stop, input '0':");

        int sum = 0;
        int count = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            count ++;

            if (number == 0) {
                break;
            }

            sum = sum + number;
        }

        scanner.close();

        System.out.println("Numbers inputed: " + count);
        System.out.println("Sum of inputed numbers: " + sum);
    }
}