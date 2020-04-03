package multithreadingExp;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import tuts.common.LoopTaskC;
import tuts.common.NamedThreadFactory;

public class NamingExecutorThreads {

	public NamingExecutorThreads() {

	}
public static void main(String[] args) {
	String currThread= Thread.currentThread().getName();
	System.out.println("["+currThread+" main thread starts");
	ExecutorService ex=Executors.newCachedThreadPool(new NamedThreadFactory());
	ex.execute(new LoopTaskC());
	ex.execute(new LoopTaskC());
	ex.execute(new LoopTaskC());
	ex.shutdown();
	System.out.println("["+currThread+"main thread ends");
}
}
