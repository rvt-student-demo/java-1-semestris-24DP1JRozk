package rvt;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Even or uneven numbers!\n");

        System.out.println("Input number:");
        double num = Integer.valueOf(scanner.nextLine());

        scanner.close();

        if (num % 2 == 1) {
            System.out.println("Number is uneven!");
        } else {
            System.out.println("Number is even!");
        }
    }
}
