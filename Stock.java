package javamultithreading;


public class Stock {

	int goods = 0;

	public synchronized void addstock(int i) {
		goods = goods + i;
		System.out.println("Stock added :" + i);
		System.out.println("Present stock :" + goods);
		notify();
	}

	public synchronized int getStock(int j) {
		while (true) {
			if (goods >= j) {
				goods = goods - j;
				System.out.println("Stock taken away :" + j);
				System.out.println("Present stock  " + goods);
				break;
			} else {
				System.out.println("Stock not enough...");
				System.out.println("Waiting for stocks to come...");
				try {
					wait();
				} catch (InterruptedException e) {
				}
			}

		}
		return goods;
	}

	public static void main(String[] args) {
		Stock j = new Stock();
		Producer p = new Producer(j);
		Consumer c = new Consumer(j);
		try {
			Thread.sleep(1000);
			System.out.println("All threads finished");
			p.stop();
			c.stop();
		} catch (InterruptedException e) {
		}
	}
}
