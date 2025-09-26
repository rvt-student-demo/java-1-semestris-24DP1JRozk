package rvt;

import java.util.Scanner;

import java.util.Random;

public class App {
    public static void main(String[] args) {

        System.out.println("Guesser!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Whats the max number that the game can think of?");
        int maxNumber = Integer.valueOf(scanner.nextLine());
        Random random = new Random();
        int result = random.nextInt(maxNumber) + 1;
        System.out.println("Guess the number from 0 to " + maxNumber + "!");

        int tries = 0;

        while (true) {
            int guess = Integer.valueOf(scanner.nextLine());
            tries ++;
            if (guess == result) {
                System.out.println("Correct!");
                break;
            } else {
                System.out.println("Try again!");
            }
            if (tries == 3) {
                System.out.println("You Lost!");
                break;
            }
        }

        scanner.close();

        if (tries == 3) {
            System.out.println("The correct answer was: " + result + "!");
        } else {
            if (tries == 1) {
                System.out.println("You won the game in: " + tries + " try! Wow!");
            } else {
                System.out.println("You won the game in: " + tries + " tires!");
            }
        }
    }
}