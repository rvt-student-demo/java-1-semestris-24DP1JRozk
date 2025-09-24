package rvt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skrūves, Uzgriežņi, Paplākšņi!\n");

        System.out.println("Ievadi skrūvju daudzumu:");
        double skruves = Integer.valueOf(scanner.nextLine());

        System.out.println("Ievadi uzgriežņu daudzumu:");
        double uzgriezni = Integer.valueOf(scanner.nextLine());

        System.out.println("Ievadi skrūvju daudzumu:");
        double sapklaksni = Integer.valueOf(scanner.nextLine());

        scanner.close();

        final double totalPrice = skruves * 0.05 + uzgriezni * 0.03 + sapklaksni * 0.01;

        System.out.println("Kopējā summa: " + totalPrice + "€");
    }
}
