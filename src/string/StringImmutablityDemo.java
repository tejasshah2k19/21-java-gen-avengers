package string;

//no self destruction 
public class StringImmutablityDemo {

	public static void main(String[] args) {

		String s = "royal";
		s = s.concat("edu");
		System.out.println(s);// royal

		System.gc(); // request --> please come to release my resources
		// memory

		// valgrind
		// junit
		//
	}
	//
}
//jre --> 10 programs --> error --> 3000*3000  3000*3000 -> matrix multiplication 
//1 gb  --> 900 mb 
//8 gb 
//google.com 
