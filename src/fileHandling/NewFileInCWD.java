package fileHandling;

import java.io.File;
import java.io.IOException;

public class NewFileInCWD {
	public static void main(String[] args) throws IOException {
		File f = new File("sample2.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
	}

}
