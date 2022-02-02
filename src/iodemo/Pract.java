package iodemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Pract {

	public static void main(String[] args) throws IOException {

		Scanner scr = new Scanner(System.in);

		File f = new File("d://Temp//numbers.txt");
		f.createNewFile();
		FileWriter fw = new FileWriter(f);
		for (int i = 1; i <= 5; i++) {
			System.out.println("Enter number");
			int num = scr.nextInt();
			fw.write(num + "\n");
		}
		fw.close();

		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);

		FileWriter fwo = new FileWriter(new File("d://Temp//odd.txt"));
		FileWriter fwe = new FileWriter(new File("d://Temp//even.txt"));

		String n = "";
		while (true) {
			n = br.readLine();
			if (n == null) {
				break;
			} else {
				int x = Integer.parseInt(n);
				if (x % 2 == 0) {
					fwe.write(x + "\n");
				} else {
					fwo.write(x + "\n");
				}
			}
		}

		br.close();
		fwe.close();
		fwo.close();
	}
}
