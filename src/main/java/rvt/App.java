package rvt;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Three number average!");

        System.out.println("Input first number:");
        double firstnum = Integer.valueOf(scanner.nextLine());

        System.out.println("Input second number:");
        double secondnum = Integer.valueOf(scanner.nextLine());

        scanner.close();
        System.out.println(firstnum + " + " + secondnum + " = " + (firstnum + secondnum));
    }
}
