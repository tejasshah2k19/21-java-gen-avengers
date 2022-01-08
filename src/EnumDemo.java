
public class EnumDemo {


	static Days d;
	
	public static void main(String[] args) {

		System.out.println(Days.SUN);
		System.out.println(PatelSodaShop.Soda.SMALL);
		System.out.println(Days.SUN.value);
		Days.getAllData(); 
		System.out.println(d.MON.value);
		
		Days dd = Days.TUE; 
		
		if ( dd == Days.TUE) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	
	}
}
 
class PatelSodaShop {

	enum Soda {
		SMALL, LARGE, XLARGE;
	}
}

enum Days {
	SUN(0), MON(1), TUE(2);
	int value;
	Days(int x){
			value = x;
	}
	
	
	static void getAllData() {
		System.out.println(Days.SUN);
		System.out.println(Days.MON);
		System.out.println(Days.TUE);
		
	}
}
