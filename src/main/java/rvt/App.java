package rvt;

import java.util.Scanner;

import javax.naming.InitialContext;

public class App {
    public static void ex1(int startV, int endV) {
        for (int i = startV; i < endV + 1; i++) {
            System.out.println(i);          
        }
    }
    public static void ex2(int startN) {

        int nSum = 0;

        for (int i = 0; i < startN + 1; i++) {
            nSum = nSum + i;         
        }

        System.out.println("Sum = " + nSum);
        System.out.println("Formula = " + (startN * (startN + 1)) / 2);
    }
    public static void ex3(int startN) {

        int nSum = 0;

        for (int i = 0; i < startN + 1; i++) {
            nSum = nSum + (i * i);         
        }

        System.out.println("Sum = " + nSum);
        System.out.println("Formula = " + (startN * (startN + 1) * (2 * startN + 1)) / 6);
    }
    public static void ex4(int startV, int endV) {

        int intSum = 0;

        for (int i = startV; i < endV + 1; i++) {
            intSum = intSum + i;          
        }

        System.out.println("Sum: " + intSum);
    }
    public static void ex5(String word) {

        for (int i = 0; i < word.length(); i++) {
            System.out.println(word);
        }
    }
    public static void ex6(String word1, String word2) {

        int seperationLenght = 30 - word1.length() - word2.length();

        System.out.print(word1);
        for (int i = 0; i < seperationLenght; i++) {
            System.out.print(".");
        }
        System.out.print(word2);
    }
    public static void ex7(String word1) {

        for (int i = 0; i < word1.length(); i++) {
            System.out.println(word1.charAt(i));
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input start N:");
        int startV = Integer.valueOf(scanner.nextLine());
        System.out.println("Input end N:");
        int endV = Integer.valueOf(scanner.nextLine()); 
        System.out.println();
        ex1(startV, endV);

        System.out.println();

        System.out.println("Enter N: ");
        int startN = Integer.valueOf(scanner.nextLine());
        ex2(startN);

        System.out.println();

        System.out.println("Enter N: ");
        startN = Integer.valueOf(scanner.nextLine());
        ex3(startN);

        System.out.println();

        System.out.println("Enter low: ");
        startV = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter high: ");
        endV = Integer.valueOf(scanner.nextLine());
        ex4(startV, endV);

        System.out.println();

        System.out.println("Input word: ");
        String word = scanner.nextLine();
        System.out.println();
        ex5(word);

        System.out.println();

        System.out.println("Input first word: ");
        String word1 = scanner.nextLine();
        System.out.println("Input second word: ");
        String word2 = scanner.nextLine();
        System.out.println();
        ex6(word1, word2);

        System.out.println();
        System.out.println();

        System.out.println("Input word: ");
        word1 = scanner.nextLine();
        ex7(word1);
    }
}

