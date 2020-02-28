package ua.lviv.logos.core.thread;

public class ThreadExxample {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new PrintThread(10);
        thread.sleep(1000);
        thread.start();

        for (int i = 0; i < 10; i++) {
            Thread.currentThread().sleep(500);
            System.out.println("A");
        }

    }

    private static void printB() {
        for (int i = 0; i <10; i++) {
            System.out.println(" B");
        }
    }
}
