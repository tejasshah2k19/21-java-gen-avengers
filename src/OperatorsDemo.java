
public class OperatorsDemo {

	public static void main(String[] args) {

		int a = 90;
		int b = 90;

		//&& all conditions must be true ==> TRUE 
		//& all conditions must be true ==> TRUE 
		
		// || 
		// | 
		
		if (a > b &  a++ > b++) { //91   91 
			System.out.println("if");
		} else {
			System.out.println("else"); // else
		}

		System.out.println(a);// -90
		System.out.println(b);
	}
}






















