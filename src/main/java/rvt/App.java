package rvt;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BookManager manager = new BookManager();
        manager.readBooks();

        System.out.print("\nWhat information will be printed? ");
        String choice = scanner.nextLine();

        manager.print(choice);
    }
}
