package fileHandling;

import java.io.File;

public class FetchFoldersInFolder {
	public static void main(String[] args) {
		File f = new File ("E:\\cad files");
		String[] allitems = f.list();
		int count = 0;
		for(String s : allitems)
		{
			File f1 = new File(f,s);
			if(f1.isDirectory())
			{
				count++;
				System.out.println(s);
			}
		}
		System.out.println("Total no of folders present : "+count);
	}

}
