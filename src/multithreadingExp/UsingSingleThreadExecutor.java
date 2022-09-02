package multithreadingExp;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import tuts.common.LoopTaskA;

public class UsingSingleThreadExecutor {

	public UsingSingleThreadExecutor() {

	}

	/*In case of SingleThreadExecutor All task will be executed one by one no mattaer how
	 * log task is.
	 * There is no need of synchronization because all tasks will be executed one by one if they
	 * are using common resource.
	 * */
public static void main(String[] args) {

	
	System.out.println("Main thread Starts here--->>>");
	ExecutorService ex=Executors.newSingleThreadExecutor();

	ex.execute(new LoopTaskA());
	ex.execute(new LoopTaskA());
	ex.execute(new LoopTaskA());
	ex.shutdown();
	//ex.execute(new LoopTaskA()); RejectedExecutionException: 
	System.out.println("----isShutDown Output----"+ ex.isShutdown());
System.out.println("Main thread ends here--->>>");
}

}
