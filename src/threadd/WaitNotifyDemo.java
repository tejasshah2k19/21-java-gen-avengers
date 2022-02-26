package threadd;

public class WaitNotifyDemo {

	public static void main(String[] args) {

		SumNumbers sm = new SumNumbers();
		sm.start();// new stack [ run() ]

		//wait notify 
		
	}
}

class SumNumbers extends Thread {
	int sum = 0;

	@Override
	public void run() {

		for (int i = 1; i <= 20; i++) {
			sum = sum + i;
		}
	}

}

//
