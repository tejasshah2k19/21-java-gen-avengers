package niod;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathPathsFilesDemo {

	public static void main(String[] args) throws IOException {

		File f = new File("d:\\Temp\\a.pdf"); // create file ? no
//		f.createNewFile();//create 

		Path p = Paths.get("d:\\Temp\\a.c"); // createfile? no
		Files.exists(p);// boolean

		Path px = f.toPath();
		File fp = px.toFile();
	}
}
