package exceptiond;

import java.io.Closeable;
import java.io.IOException;
import java.util.Scanner;

public class Exception7 {

	public static void main(String[] args) {

//		Scanner scr = new Scanner(System.in); //resource 
//		scr.close(); //resource

//db connection
		// close

		try (Scanner scr = new Scanner(System.in)) {

		} catch (Exception e) {

		}

		try {
			Api api = new Api();
			System.out.println("consuming the api....");
			api.close();
		} catch (Exception e) {

		}

		try (Api api = new Api();) {
			System.out.println("consuming the api....");
		} catch (Exception e) {

		}

	}
}

//resource --> Autocloseable interface implements 

class Api implements AutoCloseable {
	// third party

	// override
	public void close() throws Exception {
		System.out.println("closing...api");
	}
}

class AmazonApi implements Closeable {
	// third party

	public void close() throws IOException {
		System.out.println("closing... amazn api");
	}
}
