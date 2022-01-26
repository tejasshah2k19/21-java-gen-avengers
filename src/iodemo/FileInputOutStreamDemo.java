package iodemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutStreamDemo {

	public static void main(String[] args) throws IOException {
		File f = new File("d:\\Temp\\26jan.txt");
		f.createNewFile();

		FileOutputStream fos = new FileOutputStream(f);
		fos.write('r');
		fos.write('o');
		fos.write('y');
		fos.write('a');
		fos.write('l');
		fos.write(' ');
		fos.write('e');
		fos.write('d');
		fos.write('u');
		fos.write('\n');
		fos.write('a');
		fos.write('h');
		fos.write('d');
		fos.write('\n');
		fos.write('3');
		fos.write('8');
		fos.write('0');
		

		fos.close();

		FileInputStream fis = new FileInputStream(f);
		// -1

		int b = 0;

		while (true) {
			b = fis.read();
			if (b == -1) {
				break;
			}
			System.out.print((char) b);
		}
		fis.close();
		System.out.println("\n\ndone....");

	}
}
