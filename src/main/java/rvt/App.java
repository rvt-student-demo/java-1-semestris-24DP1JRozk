package rvt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Counter!\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number:");
        int number = Integer.valueOf(scanner.nextLine());
        scanner.close();

        System.out.println("");


        for (int i = 0; i <= number; i ++) {
            System.out.println(i);
        }
        System.out.println("Done!");
    }
}