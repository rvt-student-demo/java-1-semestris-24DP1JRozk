package rvt;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Course grade grader!\n");

        System.out.println("Input your course grade:");
        double courseGrade = Integer.valueOf(scanner.nextLine());

        scanner.close();
        System.out.println("Your course grade is:");

        if (courseGrade < 0){
            System.out.println("Error! Impossible!");
        } else if (courseGrade <= 49) {
            System.out.println("Failed!");
        } else if (courseGrade <= 59) {
            System.out.println("1");
        } else if (courseGrade <= 69) {
            System.out.println("2");
        } else if (courseGrade <= 79) {
            System.out.println("3");
        } else if (courseGrade <= 89) {
            System.out.println("4");
        } else if (courseGrade <= 100) {
            System.out.println("5");
        } else if (courseGrade > 100) {
            System.out.println("Incredible!");
        }
    }
}
