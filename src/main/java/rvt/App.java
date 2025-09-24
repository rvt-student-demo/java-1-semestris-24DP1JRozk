package rvt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sam & Ella delikateses!\n");

        System.out.println("Ievadi preces nosaukumu:");
        String name = scanner.nextLine();

        System.out.println("Ievadi cenu:");
        double price = Double.valueOf(scanner.nextLine());

        System.out.println("Vai bus nepieciešana express piegade? [1] = ja  [2] = ne:");
        int express = Integer.valueOf(scanner.nextLine());

        scanner.close();

        double expressPrice = 0;
        if (express == 1) {
            expressPrice = 3;
        }

        double piegade = 2;
        if (price > 10) {
            piegade = 5;
        }

        System.out.println("Rēķins:");
        System.out.println(name + "   " + price);
        System.out.println("Piegade:   " + (piegade + expressPrice));
        System.out.println("Kopa:   " + (price + piegade + expressPrice));
    }
}
