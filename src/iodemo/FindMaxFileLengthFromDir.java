package iodemo;

import java.io.File;
import java.util.Scanner;

public class FindMaxFileLengthFromDir {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);

		System.out.println("Enter dir name?");
		String dirName = scr.next(); // d://
		long maxSize = 0;
		String maxFileName = "";

		File dir = new File(dirName);
		File localFile = null;
		if (dir.exists()) {

			String fileNames[] = dir.list();
			for (int i = 0; i < fileNames.length; i++) {
				localFile = new File(dir, fileNames[i]);
				if (localFile.length() > maxSize) {
					maxSize = localFile.length();//()
					maxFileName = fileNames[i];
				}
			}
			System.out.println("Max File Name : " + maxFileName);
			System.out.println("Max File Size : " + maxSize);
		} else {
			System.out.println("directory does not exists...");
		}
	}
}
