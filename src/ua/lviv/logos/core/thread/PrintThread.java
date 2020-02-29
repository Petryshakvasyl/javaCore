package ua.lviv.logos.core.thread;

public class PrintThread extends Thread {

    private int count;

    public PrintThread(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i <count; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(" B");
        }
    }
}
