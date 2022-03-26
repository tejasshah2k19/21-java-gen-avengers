package innerclass;

public class PrintThread {

	public static void main(String[] args) {
//		Print p = new Print();
//		p.start();

		Thread t = new Thread() {
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println(i);
				}
			}
		};
		t.start();

		int x = 10;
		System.out.println(x);
		System.out.printf("%d", x);

		int y = 200;
		System.out.println(x);
	}
}
//
//class Print extends Thread {
//	public void run() {
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i);
//		}
//	}
//
//}
