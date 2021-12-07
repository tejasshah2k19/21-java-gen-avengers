
public class InstanceOfOperatorDemo {

	public static void main(String[] args) {

		Students s = new Students();
		Royals r = new Royals();
		JavaStudents js = new JavaStudents();

		// instance of --> object --> class ? ? ? ??
		System.out.println(js instanceof JavaStudents); // true
		System.out.println(js instanceof Students); // true

	}
}

//royal -- st---> parent ---child 
class Royals {
	String batchType;
}

//st -- royal --> is a 
class Students extends Royals {
	//students has a batch type 
}

//js - st -> is  a 
class JavaStudents extends Students {

}