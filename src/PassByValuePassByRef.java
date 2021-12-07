
public class PassByValuePassByRef {

	public static void main(String[] args) {

//		int a = 90;
//		Abc obj = new Abc();
//		obj.change(a);
//		System.out.println(a);//

		Abc obj = new Abc();
		Abc obj2 = obj;

		obj.k = 900;
		obj.change(obj);
		System.out.println(obj.k);//
		System.out.println(obj); // obj.toString()
		// Abc@232323
		System.out.println(obj2);
		System.out.println(obj == obj2);

		Abc k1 = new Abc(); // 121212
		Abc k2 = new Abc(); // 212121212
		k1.k = 90;
		k2.k = 90;

		System.out.println(k1 == k2);
		System.out.println(k1.k == k2.k);
	}
}

class Abc {
	int k = 90;

	int change(int a) {
		a = a + 100;
		return a;
	}

	int change(Abc x) {
		x.k = x.k + 90;
		return x.k;
	}
}
