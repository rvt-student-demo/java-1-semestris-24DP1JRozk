package rvt;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String index = scanner.nextLine();
        while (true) {
            if (index == "") {
                break;
            } else {
                list.add(Integer.valueOf(index));
            }
            index = scanner.nextLine();
        }

        System.out.print("First: ");
        Integer first = Integer.valueOf(scanner.nextLine());
        System.out.print("Last: ");
        Integer second = Integer.valueOf(scanner.nextLine());

        for (int i = first; i < second + 1; i++) {
            System.out.println(list.get(i));
        }

        scanner.close();
    }
}

