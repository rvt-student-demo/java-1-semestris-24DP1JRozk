package rvt;

import java.util.Scanner;

public class App {
    public static void divisibleByThree(int startV, int endV) {
        System.out.println();
        for (int i = startV; i < endV + 1; i++) {
            System.out.println(i);
        }      
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startV = Integer.valueOf(scanner.nextLine());
        int endV = Integer.valueOf(scanner.nextLine());

        scanner.close();
        divisibleByThree(startV, endV);
    }
}
