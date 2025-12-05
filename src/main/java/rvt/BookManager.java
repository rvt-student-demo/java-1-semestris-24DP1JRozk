package rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManager {

    public static class Book {
        private String title;
        private int pages;
        private int year;

        public Book(String title, int pages, int year) {
            this.title = title;
            this.pages = pages;
            this.year = year;
        }

        public String getTitle() {
            return this.title;
        }

        @Override
        public String toString() {
            return this.title + ", " + this.pages + " pages, " + this.year;
        }
    }

    private ArrayList<Book> books = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void readBooks() {
        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.print("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());

            books.add(new Book(title, pages, year));
        }
    }

    public void print(String what) {
        if (what.equals("everything")) {
            for (Book b : books) {
                System.out.println(b);
            }
        } else if (what.equals("name")) {
            for (Book b : books) {
                System.out.println(b.getTitle());
            }
        }
    }
}
