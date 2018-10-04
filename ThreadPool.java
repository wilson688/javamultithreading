package javamultithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable{
	private String msg; 
	
	public WorkerThread(String test) {
		msg=test; 
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName()+" start "+msg);
		display();
	}
	
	private void display() {
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {e.printStackTrace();}
	}
}
public class ThreadPool {
public static void main(String[] args) {
	ExecutorService ex = Executors.newFixedThreadPool(5);
	for(int i = 1; i < 11; i++) {
		Runnable worker = new WorkerThread(" "+i); 
		ex.execute(worker);
	}
	ex.shutdown();
	while(ex.isTerminated()) {}
	System.out.println("Finished all threads");
}
}
