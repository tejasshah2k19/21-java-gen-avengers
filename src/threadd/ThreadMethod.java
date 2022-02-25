package threadd;

public class ThreadMethod {

	public static void main(String[] args) {
		Ping p1 = new Ping();
		Pong p2 = new Pong();

		p1.setName("PingThread");
		p2.setName("PongThread");
		p1.setPriority(Thread.MAX_PRIORITY);//10 
		p1.start();// id name priority
		p2.start();
	}
}

//thread --> thread id name priority 

//priority --> 1 to 10 
//1 min 
//5 NORMAL  
//10 max 

class Ping extends Thread {
	public void run() {
		System.out.println("ping --> " + currentThread().getId() + " = " + currentThread().getName() + " = "
				+ currentThread().getPriority());

	}
}

class Pong extends Thread {
	public void run() {
		System.out.println("pong --> " + currentThread().getId() + " = " + currentThread().getName() + " = "
				+ currentThread().getPriority());

	}
}
