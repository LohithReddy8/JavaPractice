package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicateFromString {
public static void main(String[] args) {
		
		String s = "Mahabharat";
		s = s.toLowerCase();
		char[] ch = s.toCharArray();
		
		HashMap m = new HashMap();
		for(char c : ch)
		{
			if(m.containsKey(c))
			{	Object obj = m.get(c);
				Integer i =(Integer)obj;
				m.remove(c);	
			}else
			{m.put(c,1);
			}
		}
		System.out.println("String after removing duplicates :");
		Set ks = m.keySet();
		Iterator it = ks.iterator();
		while(it.hasNext())
		{System.out.print(it.next());
		}
	}}
