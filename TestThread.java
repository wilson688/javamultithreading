package javamultithreading;

public class TestThread {
	public void run() {
		for(int i=1; i <=5; i++) {
			System.out.println("Thread  "+i);
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		TestThread t1 = new TestThread(); 
		TestThread t2= new TestThread(); 
		t1.run(); t2.run();
	}
}
