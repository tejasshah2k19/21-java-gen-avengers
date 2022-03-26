package threadd;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SinglThreadPoolDemo {

	public static void main(String[] args) {
		AThread a1 = new AThread();
		AThread a2 = new AThread();
		AThread a3 = new AThread();

		/*
		 * ExecutorService ex = Executors.newSingleThreadExecutor(); ex.submit(a1);
		 * ex.submit(a2); ex.submit(a3);
		 * 
		 * ex.shutdown();
		 */
		System.out.println(Runtime.getRuntime().availableProcessors());
//		ExecutorService ex = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() - 3);//5
//		ex.submit(a1);
//		ex.submit(a2);
//		ex.submit(a3);
//
//		ex.shutdown();

//		ExecutorService ex = Executors.newCachedThreadPool(); //1F  2F           
//		ex.submit(a1);
//		ex.submit(a2);
//		ex.submit(a3);
//
//		ex.shutdown();

		ScheduledExecutorService ex = Executors.newScheduledThreadPool(3);
//		ex.schedule(a1, 5, TimeUnit.SECONDS);
		ex.scheduleAtFixedRate(a1, 5, 3, TimeUnit.SECONDS);

	}
}

class AThread extends Thread {

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("AThread");
		}
	}
}
