package collection;

import java.util.Comparator;

public class HotelByDescName implements Comparator{
	@Override
	public int compare(Object obj1 , Object obj2)
	{	Hotel h1 =(Hotel)obj1;
		Hotel h2 =(Hotel)obj2;
		return -h1.name.compareTo(h2.name);
	}
}

class HotelByAscType implements Comparator{
	@Override
	public int compare(Object obj1 , Object obj2)
	{	Hotel h1 =(Hotel)obj1;
		Hotel h2 =(Hotel)obj2;
		return h1.type.compareTo(h2.type);
	}
}

class HotelByDescType implements Comparator{
		@Override
		public int compare(Object obj1 , Object obj2)
		{	Hotel h1 =(Hotel)obj1;
			Hotel h2 =(Hotel)obj2;
			return -h1.type.compareTo(h2.type);
		}
}

class HotelByAscStaffNum implements Comparator{
	@Override
	public int compare(Object obj1 , Object obj2)
	{	Hotel h1 =(Hotel)obj1;
		Hotel h2 =(Hotel)obj2;
		Integer i1 = h1.staffNum;
		Integer i2 = h2.staffNum;
		return i1.compareTo(i2);
	}
}

class HotelByDescStaffNum implements Comparator{
	@Override
	public int compare(Object obj1 , Object obj2)
	{	Hotel h1 =(Hotel)obj1;
		Hotel h2 =(Hotel)obj2;
		Integer i1 = h1.staffNum;
		Integer i2 = h2.staffNum;
		return -i1.compareTo(i2);
	}
}
	


