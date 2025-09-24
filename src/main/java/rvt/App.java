package rvt;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gift tax!\n");

        System.out.println("Input money value of gifts got in past years:");
        double num = Integer.valueOf(scanner.nextLine());

        scanner.close();

        if (num < 5000) {
            System.out.println("No tax!");
        } else if (num < 25000) {
            System.out.println("Gift tax to pay: " + (100 + (num - 5000) * 0.08));
        } else if (num < 55000) {
            System.out.println("Gift tax to pay: " + (1700 + (num - 25000) * 0.1));
        } else if (num < 200000) {
            System.out.println("Gift tax to pay: " + (4700 + (num - 55000) * 0.12));
        } else if (num < 1000000) {
            System.out.println("Gift tax to pay: " + (22100 + (num - 200000) * 0.15));
        } else {
            System.out.println("Gift tax to pay: " + (142100 + (num - 1000000) * 0.17));
        }
    }
}
