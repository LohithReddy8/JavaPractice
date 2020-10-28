package collection;

import java.util.Comparator;

public class SortBYDescRollnum implements Comparator  {

	@Override
	public int compare(Object obj1, Object obj2) {
		Student s1= (Student)obj1;
		Student s2 = (Student)obj2;
		Integer i1 = s1.rollnum;
		Integer i2 = s2.rollnum;
		return -i1.compareTo(i2);
		
	}
}
class SortByAscName implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		Student s1= (Student)obj1;
		Student s2 = (Student)obj2;
		String n1 = s1.name;
		String n2 = s2.name;
		return n1.compareTo(n2);
	}	
}
class SortByDescName implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		Student s1= (Student)obj1;
		Student s2 = (Student)obj2;
		String n1 = s1.name;
		String n2 = s2.name;
		return -n1.compareTo(n2);
	}	
}
class SortByAscPer implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		Student s1= (Student)obj1;
		Student s2 = (Student)obj2;
		Double p1 = s1.percentage;
		Double p2 = s2.percentage;
		return p1.compareTo(p2);
	}	
}
class SortByDescPer implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		Student s1= (Student)obj1;
		Student s2 = (Student)obj2;
		Double p1 = s1.percentage;
		Double p2 = s2.percentage;
		return -p1.compareTo(p2);
	}	
}
