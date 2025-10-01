package rvt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter start: ");
        int startV = Integer.valueOf(scanner.nextLine());
        System.out.println("\nEnter end: ");
        int endV = Integer.valueOf(scanner.nextLine());
        System.out.println();

        scanner.close();

        for (int i = startV; i < endV + 1; i++) {
            System.out.println(i);          
        }
    }
}
