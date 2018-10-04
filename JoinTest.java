package javamultithreading;

public class JoinTest extends Thread {
public void run() {
	for(int i = 0; i<5; i++) {
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			
		}
		System.out.println(i);
		System.out.println("Running Thread name is"+Thread.currentThread().getName());

		System.out.println("Running Thread name is"+Thread.currentThread().getPriority());
	}
}

public static void main(String[] args) {
	JoinTest j1 = new JoinTest(); 
	JoinTest j2 = new JoinTest(); 
	JoinTest j3= new JoinTest(); 
	j1.setPriority(MIN_PRIORITY);
	j2.setPriority(MAX_PRIORITY);
	j3.setPriority(NORM_PRIORITY);
	j1.start();
	try {
		j1.join();
	}catch(InterruptedException e) {e.printStackTrace();}
	j2.start();j3.start();
}
}
