package rvt;


public class Main {

    public static void main(String[] args) {

        Counter c1 = new Counter(10);
        Counter c2 = new Counter();

        System.out.println("Counter 1 starts at: " + c1.value());
        System.out.println("Counter 2 starts at: " + c2.value());

        c1.increase();
        c1.decrease();
        c2.increase();

        System.out.println("Counter 1 now: " + c1.value());
        System.out.println("Counter 2 now: " + c2.value());
    }
}
