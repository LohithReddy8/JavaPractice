package collection;

public class Hotel implements Comparable {
	String name;
	String type;
	int staffNum;
	Hotel(String name, String  type, int staffNum)
	{
		this.name = name;
		this.type = type;
		this.staffNum = staffNum;
	}
	@Override
	public String toString() {
		
		return "Hotel name : "+name+"\n"+ "HotelType : "+type+"\n"
				+"Hotelstaff : "+staffNum+"\n";
	}
	@Override
	public int compareTo(Object obj) 
	{
		Hotel h1 = this;
		Hotel h2 = (Hotel)obj;
		return h1.name.compareTo(h2.name);
	}
}
 