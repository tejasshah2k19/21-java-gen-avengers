package iodemo;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// File
//		File f = new File("d:\\Temp\\royal.txt");// will not create file
//		f.createNewFile(); //
//		System.out.println("done...");

		Scanner scr = new Scanner(System.in);
		System.out.println("Enter file name");
		String fileName = scr.next();

//		File f = new File("d:\\Temp\\"+fileName);
//		f.createNewFile();
//		System.out.println("done....");

//		File f = new File("d:\\Temp\\",fileName);
//		f.createNewFile();
//		System.out.println("done....");
//		

		File f = new File("d:\\Temp\\" + fileName);
		System.out.println(f.length());//byte 
		
//		if (f.delete() == true) {// false true
//
//			System.out.println("file removed");
//
//		} else {
//			System.out.println("file not present ");
//		}
//		if(f.exists() == true) {
//			System.out.println("file present");
//		}else {
//			System.out.println("file not present");
//		}

		System.out.println("done....");

	}
}
