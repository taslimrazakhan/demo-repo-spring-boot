package multithreadingExp;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import tuts.common.LoopTaskA;

public class UsingFixedThreadPool{
	
	public static void main(String[] args) {
		/*In case of newFixedThreadPool if tasks are too much than number of thread of pool then
		 * some tasks goes into task queue in pending state 
		 * once the thread pool is available to handle the task;pending task gets start to executed
		 * one by one
		 * */
		System.out.println("Main thread Starts here--->>>");
			ExecutorService ex=Executors.newFixedThreadPool(3);
		
			ex.execute(new LoopTaskA());
			ex.execute(new LoopTaskA());
			ex.execute(new LoopTaskA());
			ex.shutdown();
			//ex.execute(new LoopTaskA()); RejectedExecutionException: 
			System.out.println("----isShutDown Output----"+ ex.isShutdown());
		System.out.println("Main thread ends here--->>>");
	}
}