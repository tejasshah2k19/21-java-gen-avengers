package nonaccessspecifiers;

public class InterfaceDemo {

	public static void main(String[] args) {
		RBI2022 i2 = new ICICI2022();
		// i2 is a ref of RBI
		// and instance of ICICI is assigned to ref i2

		// so memory is allocated from icici not rbi
		// and this type of object is known as polymorphic object.
		System.out.println(i2.ROI);

		System.out.println(ICICI2022.ROI);
	}
}

interface DSC {
	void reserveFund();// 5 LAC
}

interface GOI {
	void noteBandhi();
	// void bond();
}

//ref 
//instance 

//abstract interface RBI2022 
interface RBI2022 extends GOI, DSC {

	public static final float ROI = 6;

	void dep();

	public abstract void wid();
}

//5L 
class ICICI2022 implements RBI2022 {
	public void dep() {
		System.out.println(ROI);
	}

	public void wid() {

	}

	public void noteBandhi() {

	}

	public void reserveFund() {
		// 1 2 Lac
		// totalAssets -> 2.5LC --> loan RBI ->
	}

}

//marker interface --> signal pass --> JRE
interface IRDAI {
	void gReturn();
}

class LIC implements GOI, IRDAI {

	public void gReturn() {
		// sumAssured ==? 1000*12*25
		System.out.println("SumAssured" + "5% Interest* # ^");
	}

	public void noteBandhi() {
	}

}

interface TRAI {
	void sprectrum();
}

class RIL {
	public void sprectrum() {

	}
}

class JIO extends RIL implements TRAI {

}
