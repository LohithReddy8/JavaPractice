package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TestStudent {
	public static void main(String[] args) {
		TreeSet s1 = new TreeSet();
		s1.add(new Student(12,"Sai",78.00));
		s1.add(new Student(23,"Rag",45.03));
		s1.add(new Student(10,"So",74.56));
		System.out.println("Student by Asc Rollnum:");
		
		Iterator itr1 =s1.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		System.out.println("----------");
		
		TreeSet s2 = new TreeSet(new SortBYDescRollnum());
		s2.add(new Student(12,"Sai",78.00));
		s2.add(new Student(23,"Rag",45.03));
		s2.add(new Student(10,"So",74.56));
		System.out.println("Student by Desc Rollnum:");
		
		Iterator itr2 =s2.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		System.out.println("----------");
		
		TreeSet s3 = new TreeSet(new SortByAscName());
		s3.add(new Student(12,"Sai",78.00));
		s3.add(new Student(23,"Rag",45.03));
		s3.add(new Student(10,"So",74.56));
		System.out.println("Student by Asc Name:");
		
		Iterator itr3 =s3.iterator();
		while(itr3.hasNext())
		{
			System.out.println(itr3.next());
		}
		System.out.println("----------");
		
		TreeSet s4 = new TreeSet(new SortByDescName());
		s4.add(new Student(12,"Sai",78.00));
		s4.add(new Student(23,"Rag",45.03));
		s4.add(new Student(10,"So",74.56));
		System.out.println("Student by Desc Name:");
		
		Iterator itr4 =s4.iterator();
		while(itr4.hasNext())
		{
			System.out.println(itr4.next());
		}
		System.out.println("----------");
		
		TreeSet s5 = new TreeSet(new SortByAscPer());
		s5.add(new Student(12,"Sai",78.00));
		s5.add(new Student(23,"Rag",45.03));
		s5.add(new Student(10,"So",74.56));
		System.out.println("Student by Asc Percentage:");
		
		Iterator itr5 =s5.iterator();
		while(itr5.hasNext())
		{
			System.out.println(itr5.next());
		}
		System.out.println("----------");
		
		
		TreeSet s6 = new TreeSet(new SortByDescPer());
		s6.add(new Student(12,"Sai",78.00));
		s6.add(new Student(23,"Rag",45.03));
		s6.add(new Student(10,"So",74.56));
		System.out.println("Student by Desc Percentage:");
		
		Iterator itr6 =s6.iterator();
		while(itr6.hasNext())
		{
			System.out.println(itr6.next());
		}
		System.out.println("----------");
		
		
	}

}
