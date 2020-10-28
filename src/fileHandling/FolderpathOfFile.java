package fileHandling;

import java.io.File;

public class FolderpathOfFile {
	public static void main(String[] args) {
		File f = new File ("Sample.txt");
		System.out.println(f.exists());
		String completepath = f.getAbsolutePath();
		System.out.println(completepath);
	}

}
