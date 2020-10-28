package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(12);
		l.add("hi");
		l.add(12);
		l.add(12.35);
		System.out.println(l);
		 
		Object[] objarr = l.toArray();
		for(Object obj : objarr)
		{
			System.out.println(obj);
		}
		 
		Integer [] i = {12,24,89};
		List c1 = Arrays.asList(i);
		System.out.println(c1);
		System.out.println(c1.get(1));
		//c1.add(95);
		c1.set(1,50);
		System.out.println(c1.get(1));
		//c1.remove(1);
		//c1.set(1,"hello");
		
	}
	
	
}
