package rvt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first word: ");
        String word1 = scanner.nextLine();
        System.out.println("Input second word: ");
        String word2 = scanner.nextLine();
        System.out.println();

        scanner.close();

        int seperationLenght = 30 - word1.length() - word2.length();

        System.out.print(word1);
        for (int i = 0; i < seperationLenght; i++) {
            System.out.print(".");
        }
        System.out.print(word2);
    }
}

