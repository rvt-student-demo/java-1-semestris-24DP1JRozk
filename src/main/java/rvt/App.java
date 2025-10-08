package rvt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\nWhitch two index values sould be swapped?");
        int first_swap = Integer.valueOf(scanner.nextLine());
        int second_swap = Integer.valueOf(scanner.nextLine());
        System.out.println();

        scanner.close();

        int temp = arr[first_swap];
        arr[first_swap] = arr[second_swap];
        arr[second_swap] = temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

