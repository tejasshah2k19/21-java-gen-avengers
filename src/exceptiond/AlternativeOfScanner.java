package exceptiond;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlternativeOfScanner {

	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("enter name");

		// try catch
		String name = br.readLine();// IOException --> checked
		System.out.println(name);
	}
}
