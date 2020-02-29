package ua.lviv.logos.core.thread;

public class TheadExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new PrintRunnable());
        thread.start();
        for (int a = 0; a < 10; a++) {
            Thread.sleep(100);
            System.out.println("A" + a);
        }
//
// 			   1 2 3 4 5 6  7  8
        // 1 2 3 5 8 13 21 34
//		System.out.println(f(8));
    }

    // fibonacci
    public static int f(int a) {

        if (a == 1) return 1;
        if (a == 2) return 2;
        // 2      +   //1
        return f(a - 1) + f(a - 2);
    }

}
