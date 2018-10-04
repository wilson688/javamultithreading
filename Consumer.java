package javamultithreading;

public class Consumer implements Runnable {
	Stock c; 
	Thread t; 
	
	Consumer(Stock c) {
		this.c=c; 
		t=new Thread(this, "Consumer thread"); 
		t.start();
		}

	@Override
	public void run() {
		while(true) {
			try {
				t.sleep(750); 
				
			}catch(InterruptedException e) {}
			c.getStock((int) Math.random()*100); 
		}
	}
	
	public void stop() {
	t.stop(); 
	}
}
	
