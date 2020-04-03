
public class ThreadDemo extends Thread {
	public static void main(String[] args) throws InterruptedException {
		//Thread t=new Thread();
		ThreadDemo t=new ThreadDemo();
		Thread2 t2=new Thread2();
		System.out.println(Thread.currentThread().getName() + " " +Thread.currentThread().getPriority());
		t.start();
		sleep(10000);
		t2.start();
		sleep(20000);
		System.out.println("Hi");
	}
@Override
	public void run(){
	
		System.out.println("Run method");
		System.out.println(Thread.currentThread().getName() + " " +Thread.currentThread().getPriority());
	}
}
class Thread2 extends Thread {
	
	public void run() {
		System.out.println("Thread 2");
		System.out.println(Thread.currentThread().getName() + " " +Thread.currentThread().getPriority());
	}
}
