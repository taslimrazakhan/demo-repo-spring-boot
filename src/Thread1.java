
public class Thread1 extends Thread3 {
	public static void main(String[] args) throws InterruptedException {
	
		Thread1 t1=new Thread1();
		Thread3 t3=new Thread3();
		t1.start();
		System.out.println("T1 is dead");
		t1.join();
		t3.start();
	}

	
	public static void sum(){
		System.out.println("Test Sum");
	}
	public void run(){
		System.out.println("Thread 1 is sleeping for 10 sec");
		try {
			sleep(10000);
			System.out.println("Thread 1 executed ");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	}

class Thread3 extends Thread {
	public void run(){
		System.out.println("Thread 3 is sleeping 10 sec");
		try {
			sleep(10000);
			System.out.println("Thread 3 executed");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
