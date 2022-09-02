package tuts.common;

import java.util.concurrent.TimeUnit;

public class LoopTaskC  implements Runnable{
private  int id;
private static int count=0;
private String taskId;
	public LoopTaskC() {
		this.id=++count;
		taskId="LoopTaskC "+id;
	}

	/* avoid to change the name of the thread inside the task;thread may loose its identity*/
	@Override
	public void run() {
		//Thread.currentThread().setName("MyThread " +id);
		//String currentThread= Thread.currentThread().getName();
		System.out.println("####  ["+Thread.currentThread().getName()+" ]" +taskId+"  > Starting ####");
		for(int i=0;i<5;i++) {
			System.out.println("####   ["+ Thread.currentThread().getName()+" ]"+ taskId+"  > Tik Tik "+ i+" ####");
			try {
				TimeUnit.MILLISECONDS.sleep((long)Math.random()*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("*****    ["+Thread.currentThread().getName()+" ]" +taskId+"  > Done *****");
	}

}
