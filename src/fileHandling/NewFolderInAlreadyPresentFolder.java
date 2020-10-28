package fileHandling;

import java.io.File;
import java.io.IOException;

public class NewFolderInAlreadyPresentFolder {
	public static void main(String[] args) throws IOException {
		File f = new File("G:\\FIleHandlingPracticeFolder\\MyOwnFolder");
		f.mkdir();
		File f1 = new File("G:\\FIleHandlingPracticeFolder\\MyOwnFolder","xyz.txt");
		System.out.println(f1.exists());
		f1.createNewFile();
		System.out.println(f1.exists());
	}

}
