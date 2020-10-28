package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class OccuranceOfChar {
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
				m.put(c,i+1);	
			}else
			{m.put(c,1);
			}
		}
		System.out.println("Occurance of chararcters are :");
		Set es = m.entrySet();
		Iterator it = es.iterator();
		while(it.hasNext())
		{
			Object obj = it.next();
			Map.Entry e =(Map.Entry)obj;
			System.out.println("character "+e.getKey()+" is present "+e.getValue()+" times");
		}
		
	}
	

}
