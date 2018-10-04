package javamultithreading;

public class Producer implements Runnable {
	Stock s;
	Thread t;

	Producer(Stock s) {
		this.s = s;
		t = new Thread(this, "producer thread");
		t.start();

	}

	@Override
	public void run() {
		while (true) {
			try {
				t.sleep(750);
			} catch (InterruptedException e) {
			}
			s.addstock((int) (Math.random() * 100));
		}
	}

	public void stop() {
		t.stop();
	}
}
