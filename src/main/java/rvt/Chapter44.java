package rvt;

import java.util.Scanner;

public class Chapter44 {

    public static void main(String[] args) {
        ex7();
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
    public static void ex4() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input time:");
        String time = scanner.nextLine();

        int i = time.length();

        if (i > 2) {
            int minutesi = i - 2;
            String minutes = time.substring(0, minutesi);
            String seconds = time.substring(minutesi, i);

            System.out.println(minutes + ":" + seconds);
        } else {
            System.out.println("0:" + time);
        }
    }
    public static void ex5() {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            if (line.startsWith("//")) {
                System.out.println(line);
            }
        }
    }
    public static void ex6() {
        Scanner scanner = new Scanner(System.in);
        boolean inBlockComment = false;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String trimmed = line.trim();
            if (trimmed.startsWith("/*")) {
                inBlockComment = true;
                System.out.println(line);
                continue;
            }

            if (trimmed.startsWith("*/")) {
                inBlockComment = false;
                System.out.println(line);
                continue;
            }

            if (trimmed.startsWith("//")) {
                System.out.println(line);
                continue;
            }

            if (inBlockComment) {
                System.out.println(line);
            }
        }
    }
    public static void ex7() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your password:");
            String password = scanner.nextLine();

            if (password.length() < 7) {
                System.out.println("That password is not acceptable.\n");
                continue;
            }

            boolean hasUpper = false;
            boolean hasLower = false;
            boolean hasDigit = false;

            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                if (Character.isUpperCase(c)) hasUpper = true;
                if (Character.isLowerCase(c)) hasLower = true;
                if (Character.isDigit(c)) hasDigit = true;
            }

            if (hasUpper && hasLower && hasDigit) {
                System.out.println("Acceptable password.");
                break;
            } else {
                System.out.println("That password is not acceptable.\n");
            }
        }
    }
}
