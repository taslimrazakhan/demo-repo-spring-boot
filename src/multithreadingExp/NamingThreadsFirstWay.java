package multithreadingExp;

import tuts.common.LoopTaskB;

public class NamingThreadsFirstWay {

	public NamingThreadsFirstWay() {
}

	public static void main(String[] args) {
		String currThread= Thread.currentThread().getName();
		System.out.println("["+currThread+" main thread starts");
		new Thread(new LoopTaskB()).start();
		Thread t2=new Thread(new LoopTaskB());
		t2.start();
		System.out.println("["+currThread+"main thread ends");
	}
}
