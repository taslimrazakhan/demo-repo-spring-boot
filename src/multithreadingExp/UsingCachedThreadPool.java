package multithreadingExp;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import tuts.common.LoopTaskA;

public class UsingCachedThreadPool {
	/*In case of newCatchedThreadPool; as many as task comes new thread are created and reused to finish
	 * the tasks; no task has to wait in task queue ;no limit of thread created by the pool
	 */
	public UsingCachedThreadPool() {
	}
	public static void main(String[] args) {
		
		System.out.println("Main thread Starts here--->>>");
		ExecutorService ex=Executors.newCachedThreadPool();
	
		ex.execute(new LoopTaskA());
		ex.execute(new LoopTaskA());
		ex.execute(new LoopTaskA());
		ex.shutdown();
		//ex.execute(new LoopTaskA()); RejectedExecutionException: 
		System.out.println("----isShutDown Output----"+ ex.isShutdown());
	System.out.println("Main thread ends here--->>>");
	}

}
