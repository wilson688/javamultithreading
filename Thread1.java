package javamultithreading;

public class Thread1 extends Thread {
public void run() {
	System.out.println("Thread is running");
}
public static void main(String[] args) {
	System.out.println("Main Thread"+Thread.currentThread().getName());
	Thread1 t = new Thread1(); 
	t.start(); 
}
}

class RunnableTest implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Runnable is running");
		
	}
	
	public static void main(String[] args) {
		RunnableTest r1 = new RunnableTest(); 
		Thread t1 = new Thread(r1); 
		t1.start(); 
	}
	
}
