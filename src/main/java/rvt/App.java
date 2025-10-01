package rvt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input word: ");
        String word = scanner.nextLine();
        System.out.println();

        scanner.close();

        for (int i = 0; i < word.length(); i++) {
            System.out.println(word);
        }
    }
}
