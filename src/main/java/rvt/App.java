package rvt;

import java.util.Scanner;

public class App {
    public static void ex1() {
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
    public static void ex2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter N: ");
        int startN = Integer.valueOf(scanner.nextLine());

        scanner.close();

        int nSum = 0;

        for (int i = 0; i < startN + 1; i++) {
            nSum = nSum + i;         
        }

        System.out.println("Sum = " + nSum);
        System.out.println("Formula = " + (startN * (startN + 1)) / 2);
    }
    public static void ex3() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter N: ");
        int startN = Integer.valueOf(scanner.nextLine());

        scanner.close();

        int nSum = 0;

        for (int i = 0; i < startN + 1; i++) {
            nSum = nSum + (i * i);         
        }

        System.out.println("Sum = " + nSum);
        System.out.println("Formula = " + (startN * (startN + 1) * (2 * startN + 1)) / 6);
    }
    public static void ex4() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter low: ");
        int startV = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter high: ");
        int endV = Integer.valueOf(scanner.nextLine());

        scanner.close();

        int intSum = 0;

        for (int i = startV; i < endV + 1; i++) {
            intSum = intSum + i;          
        }

        System.out.println("Sum: " + intSum);
    }
    public static void ex5() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input word: ");
        String word = scanner.nextLine();
        System.out.println();

        scanner.close();

        for (int i = 0; i < word.length(); i++) {
            System.out.println(word);
        }
    }
    public static void ex6() {
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
    public static void ex7() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input word: ");
        String word1 = scanner.nextLine();

        scanner.close();

        for (int i = 0; i < word1.length(); i++) {
            System.out.println(word1.charAt(i));
        }
    }
    public static void main(String[] args) {

        while (true) {
            
            System.out.print("Input the exercise you want to run (from 1 to 7): ");
            Scanner scanner = new Scanner(System.in);
            int exercise = Integer.valueOf(scanner.nextLine());
            scanner.close();

            if (exercise == 1) {
                System.out.println("Exercise 1 — Run of Integers");
                ex1();
            } else if (exercise == 2) {
                System.out.println("Exercise 2 — Sum of Sequential Integers");
                ex2();
            } else if (exercise == 3) {
                System.out.println("Exercise 3 — Sum of Sequential Squares");
                ex3();
            } else if (exercise == 4) {
                System.out.println("Exercise 4 — Sum of a Range of Sequential Integers");
                ex4();
            } else if (exercise == 5) {
                System.out.println("Exercise 5 — Repeatedly Echo a Word");
                ex5();
            } else if (exercise == 6) {
                System.out.println("Exercise 6 — Words Separated by Dots");
                ex6();
            } else if (exercise == 7) {
                System.out.println("Exercise 7 — One Letter per Line");
                ex7();
            } else {
                System.out.println("Incorrect Input!");
            }
            System.out.println();
        }
    }
}

