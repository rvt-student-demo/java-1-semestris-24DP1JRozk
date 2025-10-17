package rvt;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String index = scanner.nextLine();
        while (true) {
            if (index == "") {
                break;
            } else {
                list.add(index);
            }
            index = scanner.nextLine();
        }

        System.out.print("Search for? ");
        String search = scanner.nextLine();

        boolean found = false;

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " " + search);
            if (list.get(i) == search) {
                found = true;
                break;
            }
        }

        if (found == true) {
            System.out.println(search + " was found!");
        } else {
            System.out.println(search + " was not found!");
        }
        
        scanner.close();
    }
}

