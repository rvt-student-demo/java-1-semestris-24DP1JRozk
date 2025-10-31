package rvt;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();
        int i = scanner.nextInt();
        while (i != -1) {
            statistics.addNumber(i);
            i = scanner.nextInt();
        }
        scanner.close();
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + statistics.sumOfEven());
        System.out.println("Sum of odd numbers: " + statistics.sumOfOdd());

    }
    public static void removeLast(ArrayList<String> list) {
        list.remove(list.size() - 1);
    }
    
    public static class Statistics {
        private int count;
        private int sum;
        private int odd;
        private int even;

        public Statistics() {
            this.count = 0;
        }

        public void addNumber(int number) {
            this.count++;
            this.sum += number;
            if (number % 2 == 0) {
                this.even += number;
            } else {
                this.odd += number;
            }
        }

        public int getCount() {
            return this.count;
        }

        public int sum() {
            return this.sum;
        }

        public int sumOfEven() {
            return this.even;
        }

        public int sumOfOdd() {
            return this.odd;
        }

        public double average() {
            if (this.count == 0) {
                return 0;
            }
            return this.sum * 1.0 / this.count;
        }
    }
}

