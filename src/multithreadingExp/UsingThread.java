package multithreadingExp;

import tuts.common.LoopTaskA;

public class UsingThread {
	public static void main(String[] args) {
		System.out.println("main thread name=====>>>>>  "+Thread.currentThread().getName());
		Thread t1= new Thread(new LoopTaskA());
		t1.start();
		try {
			System.out.println("before sleeping of T1");
			t1.sleep(10000);
			System.out.println("After Sleeping of T1");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main thread ends here ---->>>>>"+Thread.currentThread().getName());
	}
	
}
