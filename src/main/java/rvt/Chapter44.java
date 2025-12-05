package rvt;

import java.util.Scanner;

public class Chapter44 {

    public static void main(String[] args) {
        ex2();
    }
    public static void ex1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine().trim();

        int spaceIndex = name.indexOf(" ");

        if (spaceIndex < 0) {
            System.out.println(name);
            return;
        }

        String first = name.substring(0, spaceIndex);
        String last = name.substring(spaceIndex + 1).toUpperCase();

        System.out.println(first + " " + last);
    }
    public static void ex2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your string: ");
        String name = scanner.nextLine();
        Integer i = name.length();
        for (int j = 0; j < i; j++) {
            System.out.println(name.charAt(j));
        }
    }
}
