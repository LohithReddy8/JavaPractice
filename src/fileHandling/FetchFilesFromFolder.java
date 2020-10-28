package fileHandling;

import java.io.File;

public class FetchFilesFromFolder {
	public static void main(String[] args) {
		
		File f = new File("E:\\cad files");
		String[] allitems = f.list();
		int count = 0;
		for(String s : allitems)
		{
			File f1 = new File(f,s);
			if(f1.isFile())
			{
				count++;
				System.out.println(s);
			}
		}
		System.out.println("Total no of Files present :"+count);		
	}
}
