package rvt;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());
    }
    public static void removeLast(ArrayList<String> list) {
        list.remove(list.size() - 1);
    }
    
    public static class Statistics {
        private int count;
        private int sum;

        public Statistics() {
            this.count = 0;
        }

        public void addNumber(int number) {
            this.count++;
            this.sum += number;
        }

        public int getCount() {
            return this.count;
        }

        public int sum() {
            return this.sum;
        }

        public double average() {
            if (this.count == 0) {
                return 0;
            }
            return this.sum * 1.0 / this.count;
        }
    }
}

