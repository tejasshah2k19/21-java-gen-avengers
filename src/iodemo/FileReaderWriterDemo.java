package iodemo;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {

	public static void main(String[] args) throws IOException {
		File f = new File("d:\\Temp\\26jan-2.txt");
		f.createNewFile();

		FileWriter fw = new FileWriter(f);
		fw.write("royal education\nAhmedabad\n380019");
		fw.close();
		System.out.println("....done...");

		FileReader fr = new FileReader(f);
		int b = 0;
		
		int size = (int) f.length(); // long--> size of file byte -> ram ->3	
		
		char c[] = new char[size];
	
		fr.read(c);
		
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		fr.close();

	}
}
