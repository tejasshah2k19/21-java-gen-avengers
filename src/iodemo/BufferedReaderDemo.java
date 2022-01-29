package iodemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {

		File f = new File("d:\\Temp\\golmal.txt");
//		f.createNewFile();
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);

		String line = "";
		while (true) {

			line = br.readLine();
			
			if (line == null) {
				break;
			}
			System.out.println(line);
		}
		br.close();
	}
}
