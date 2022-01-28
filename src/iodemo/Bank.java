package iodemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Bank implements Serializable {
	String email, password;
	int balance;

	// a
	void getData() {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter email and password");
		email = scr.next();
		password = scr.next();
		balance = (int) (Math.random() * 100000);
	}

	void display() {
		System.out.println(email + " " + password + " " + balance);
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Bank ram = new Bank();
		Bank shyam = new Bank();
		Bank sita = new Bank();

		ram.getData();
		shyam.getData();
		sita.getData();

		ram.display();
		shyam.display();
		sita.display();

		File f = new File("users.txt");
		f.createNewFile();
//
//		FileOutputStream fos = new FileOutputStream(f);
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//
//		oos.writeObject(ram);
//		oos.writeObject(shyam);
//		oos.writeObject(sita);
//
//		oos.close();
//		
//		------------------------
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);

		Bank ramBackup = (Bank) ois.readObject();

		System.out.println("after reading first object ");

		ramBackup.display();

		ois.close();

		// File f = new File("users.txt");
//		f.createNewFile();

//		FileWriter fw = new FileWriter(f);
//
//		fw.write(ram.email + " " + ram.password + " " + ram.balance + "\n");
//		fw.write(shyam.email + " " + shyam.password + " " + shyam.balance + "\n");
//		fw.write(sita.email + " " + sita.password + " " + sita.balance + "\n");
//
//		fw.close();

	}
}
