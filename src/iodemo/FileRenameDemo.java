package iodemo;

import java.io.File;

public class FileRenameDemo {

	public static void main(String[] args) throws Exception {

//		File f = new File("d:\\Temp\\april.txt");//link 
//	
//		File f2 = new File("d:\\Temp\\june.txt"); //link 
//		
//		f.renameTo(f2); 
//		System.out.println("done...");

		File f3 = new File("d:\\Temp\\june.txt");
		System.out.println(f3.isHidden());
		System.out.println(f3.canRead());
		System.out.println(f3.canWrite());
		System.out.println(f3.canExecute());
		
		
		
		

	 
		
	
	}
}
