package fileHandling;

import java.io.File;

public class DeleteFolderInCMD {
	public static void main(String[] args) {
		File f = new File("./FileContainer22");
		System.out.println(f.exists());
		f.delete();
		System.out.println(f.exists());
	}
	

}
