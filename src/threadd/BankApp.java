package threadd;

public class BankApp {

	public static void main(String[] args) {

		Customer tejas = new Customer();
		Customer kj = new Customer();

		Thread kj1 = new Thread(kj);
		kj1.setName("kj1");
		Thread prisha = new Thread(tejas);
		prisha.setName("prisha");
		Thread krishna = new Thread(tejas);
		krishna.setName("krishna");
		Thread tjs = new Thread(tejas);
		tjs.setName("tejas");

		kj1.start();
		prisha.start();
		krishna.start();
		tjs.start();
//		System.out.println(tejas.balance);
	}

}

class Customer extends Thread {

	static int x = 9000;

	static void add() {

	}

	int balance = 30000;

	synchronized void wid(int amt) {
		System.out.println(currentThread().getName() + " is wid......");
		if (balance == 0) {
			System.out.println(currentThread().getName() + " XXXXXXXXXXXXXXXXXXXXXXX");

		} else {
			balance = balance - amt;

		}
		System.out.println(currentThread().getName() + " wid done....");
		System.out.println("Final Balance " + balance);
	}

	public void run() {
		wid(15000);
	}

}
