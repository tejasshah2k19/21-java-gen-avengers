package threadd;

public class ThreadSleepDemo {

	public static void main(String[] args) {
		Santa s = new Santa();
		Banta b = new Banta();

		s.start();
		b.start();
	}
}

class Santa extends Thread {

	public void run() {
		for (int i = 1; i <= 3; i++) {
			System.out.println("santa " + i);
		}
	}

}

class Banta extends Santa {
	public void run() {
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} // 1 second
		for (int i = 1; i <= 3; i++) {
			System.out.println("banta " + i);
		}

	}
}
