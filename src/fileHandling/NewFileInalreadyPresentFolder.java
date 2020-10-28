package fileHandling;

import java.io.File;
import java.io.IOException;

public class NewFileInalreadyPresentFolder {
	public static void main(String[] args) throws IOException {
		File f1 = new File("G:\\FIleHandlingPracticeFolder\\abc.txt");
		System.out.println(f1.exists());
		f1.createNewFile();
		System.out.println(f1.exists());
		
	}

}
