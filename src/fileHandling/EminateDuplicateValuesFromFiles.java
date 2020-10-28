package fileHandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class EminateDuplicateValuesFromFiles {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br1 =new BufferedReader(new FileReader("sample1.txt"));
		BufferedReader br2 =new BufferedReader(new FileReader("sample2.txt"));
		PrintWriter pw =new PrintWriter("result1.txt");
		
		ArrayList<String> l = new ArrayList();
		String line2 = br2.readLine();
		while(line2!=null)
		{
			l.add(line2);
			line2 = br2.readLine();
		}
		String line1 = br1.readLine();
		while(line1!=null) 
		{
			if(l.contains(line1))
			{
				l.remove(line1);
			}
			else {
				pw.println(line1);
			}
			line1 = br1.readLine();
		}
		Iterator<String> itr = l.iterator();
		while(itr.hasNext())
		{
			pw.println(itr.next());
		}
		
		pw.flush();
		pw.close();
		br1.close();
		br2.close();
		System.out.println("pass");
	}


}
