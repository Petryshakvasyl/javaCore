package ua.lviv.logos.core.thread;

public class BlockedExample {
    private volatile int vl;
    public static void main(String[] args) {
        BlockedExample ref = new BlockedExample();

        for (int i = 0; i < 5; i++) {
            new Thread(new BlockedCaller(ref, i)).start();
        }
    }

    public synchronized void f(int x) {
        System.out.println("+" + x);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("-" + x);
    }
}

class BlockedCaller implements Runnable{

    private final int value;
    BlockedExample ref;

    public BlockedCaller(BlockedExample ref, int value) {
        this.ref = ref;
        this.value = value;
    }

    @Override
    public void run() {
        ref.f(value);
    }
}
