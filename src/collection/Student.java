package collection;
public class Student implements Comparable{
	
	int rollnum;
	String name;
	double percentage;
	
	Student (int rollnum,String name,double percentage)
	{
		this.rollnum = rollnum;
		this.name= name;
		this.percentage =percentage;
	}
	@Override
	public String toString()
	{
		return "name:"+name+",Rollnum:"+rollnum+",Percentage:"+percentage;
	}
	@Override
	public int compareTo(Object obj) {
		Student s1 =this;
		Student s2 =(Student)obj;
		Integer i1= s1.rollnum;
		Integer i2 = s2.rollnum;
		return i1.compareTo(i2);
	}

}
