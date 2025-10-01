package rvt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input word: ");
        String word1 = scanner.nextLine();

        scanner.close();

        for (int i = 0; i < word1.length(); i++) {
            System.out.println(word1.charAt(i));
        }
    }
}

