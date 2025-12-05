package rvt;

import java.util.Scanner;

public class Chapter44 {

    public static void main(String[] args) {
        ex3();
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
    public static void ex3() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a name:\n");
            String input = scanner.nextLine();

            if (input.length() == 0) {
                break;
            }

            String name = input.trim();

            String lower = name.toLowerCase();

            if (lower.startsWith("amy") ||
                lower.startsWith("buffy") ||
                lower.startsWith("cathy")) {

                System.out.println("Ms. " + name + "\n");

            } else if (lower.startsWith("elroy") ||
                        lower.startsWith("fred") ||
                        lower.startsWith("graham")) {

                System.out.println("Mr. " + name + "\n");

            } else {
                System.out.println(name + "\n");
            }
        }
    }
}
