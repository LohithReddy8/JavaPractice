package fileHandling;

import java.io.File;
import java.io.IOException;

public class NewFolderInCMD {
 public static void main(String[] args) throws IOException {
	File f = new File("File Container");
	f.mkdir();
	File f1 = new File("File Container","samplefolederfile.txt");
	f1.createNewFile();
	System.out.println(f1.exists());
}
}
