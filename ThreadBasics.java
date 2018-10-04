package javamultithreading;

class ThreadA implements Runnable{
	public void run() {
		for(int i=0; i <=5; i++) {
			System.out.println("Thread A "+i);
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class ThreadB implements Runnable{
	public void run() {
		for(int i=0; i <=5; i++) {
			System.out.println("Thread B "+i);
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class ThreadBasics {
	public static void main(String[] args) {
		ThreadA r1 = new ThreadA(); 
		Thread t1 = new Thread(r1); 
		ThreadB r2 = new ThreadB(); 
		Thread t2 = new Thread(r2); 
		
		t1.start();
		t1.start();
	}

}
