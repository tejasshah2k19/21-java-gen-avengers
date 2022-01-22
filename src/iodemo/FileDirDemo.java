package iodemo;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileDirDemo {

	public static void main(String[] args) throws IOException {

		printAllContentOfgivenDirectory();
		System.out.println("done----");
	}

	static void printAllContentOfgivenDirectory() {

		Scanner scr = new Scanner(System.in);
		System.out.println("Enter Directory Name");
		String dirName = scr.next(); // D:\\Temp\\X
		// D:\\Temp\\myjava

		File d = new File(dirName);
		if (d.exists()) {
			// print all file name
			String names[] = d.list();
			for (int i = 0; i < names.length; i++) {
				System.out.println(names[i]);
			}

		} else {
			System.out.println("Folder does not exits");
		}

	}

	static void createFolders() {
		File d = new File("D:\\Temp\\myjava\\chapter1\\intro");
//		System.out.println(d.mkdir());
		System.out.println(d.mkdirs());
	}

	static void removeFolder() {

		File f = new File("D:\\Temp\\myjava");//
		System.out.println(f.delete()); // remove folder --- folder must be empty
		String fileName[] = f.list(); // return all the files name from f
		System.out.println(fileName.length);// 1

		if (f.list().length == 0) {
			System.out.println("you can delete folder");
		} else {
			System.out.println("folder is not empty");
			for (String x : fileName) {
				System.out.println(x);
			}

		}

	}

	static void createFolder() throws IOException {
		File d = new File("D:\\Temp\\myjava");

		if (d.exists()) {
			System.out.println("folder is present");
		} else {
			System.out.println("folder is not present");
		}

//		d.createNewFile(); // if you use this method than it  will create myjava file without extension 
		d.mkdir(); // boolean -> folder present return false | create -> true

		// 1 string -> path and filename
		// 2 string,strinng -> path , filename
		// 3 file ,string --> path , filename

		File j = new File(d, "A.java");
		// or File j = new File("d:\\Temp\\myjava","A.java");
		j.createNewFile();

	}
}
