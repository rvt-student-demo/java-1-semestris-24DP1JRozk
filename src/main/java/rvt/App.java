package rvt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Counter!\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input numbers, to stop, input '-1':");

        int sum = 0;
        int count = 0;
        int even = 0;
        int odd = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == -1) {
                break;
            }

            if (number % 2 == 1) {
                odd ++;
            } else {
                even ++;
            }

            sum = sum + number;

            count ++;
        }

        scanner.close();

        System.out.println("Thx! Bye!");
        System.out.println("Sum of inputed numbers: " + sum);
        System.out.println("Numbers inputed: " + count);
        System.out.println("Average: " + (1.0 * sum / count));
        System.out.println("Even number count: " + even);
        System.out.println("Odd number count: " + odd);
    }
}