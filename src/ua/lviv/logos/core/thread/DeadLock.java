package ua.lviv.logos.core.thread;

public class DeadLock {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Strat method main");
        Thread.currentThread().join();
        System.out.println("End method main");
    }
}
