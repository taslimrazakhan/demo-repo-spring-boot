package tuts.common;

import java.util.concurrent.TimeUnit;

public class LoopTaskA  implements Runnable{
private  int id;
private static int count=0;
	public LoopTaskA() {
		this.id=++count;
	}

	@Override
	public void run() {
		
		System.out.println("####   <Task "+id +" > Starting ####");
		for(int i=0;i<5;i++) {
			System.out.println("####   <Task "+id +" > Tik Tik "+ i+" ####");
			try {
				TimeUnit.MILLISECONDS.sleep((long)Math.random()*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("*****   <Task "+id +" > Done *****");
	}

}
