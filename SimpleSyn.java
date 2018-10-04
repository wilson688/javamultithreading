package javamultithreading;

class Callme{
	void call(String msg) {
		System.out.println("["+msg);
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {System.out.println("Interrupted");}
	}
}
class Caller1 implements Runnable{
	String msg;
	Callme target; 
	Thread t; 
	public Caller1(Callme targ, String s) {
		target = targ; 
		msg=s; 
		t=new Thread(this); 
		t.start(); 
	}
	

	@Override
	public void run() {
	synchronized(target) {
		target.call(msg);
	}
	} 
	
}

class Synch{
	public static void main(String[] args) {
		Callme target = new Callme(); 
		Caller1 o1 = new Caller1(target, "Hello"); 
		Caller1 o2 = new Caller1(target, "Synchronized"); 
		Caller1 o3 = new Caller1(target, "world"); 
	}
}
public class SimpleSyn {

}
