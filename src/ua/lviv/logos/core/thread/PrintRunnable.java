package ua.lviv.logos.core.thread;

class PrintRunnable implements Runnable{

	@Override
	public void run() {
		for (int a = 0; a < 10; a++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("  B" + a);
		}
	}
}
