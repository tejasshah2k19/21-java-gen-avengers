package threadd;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		Copy c = new Copy();
		Print p = new Print();
		c.start();// run
		c.join();
		p.start();// run
	 
		// c.cop	
		// p.print

	}
}

// Thread   class 
//	1) extends Thread 
//	2) override run()
//	3) start execute 
// Runnable interface 
class Copy extends Thread {
	void copypaste() {
		for (int i = 1; i <= 15; i++) {
			System.out.println("copy " + i);
			if(i == 10)
				stop();//
		}
	}

	public void run() {
		copypaste();
	}
}

class Print extends Thread {
	void printData() {
		for (int i = 1; i <= 15; i++) {
			System.out.println("print " + i);
		}
	}

	public void run() {
		printData();
	}
}