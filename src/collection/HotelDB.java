package collection;

import java.util.Arrays;

public class HotelDB {
	public static void main(String[] args) {
		
		Hotel [] h = new Hotel[5];
		h[0] = new Hotel("udapi","veg",10);
		h[1] = new Hotel("radha","non-veg",15);
		h[2] = new Hotel("krishna","veg",20);
		h[3] = new Hotel("sita","veg",40);
		h[4] = new Hotel("annapurna","mix",20);
		
		for(Hotel h1:h)
		{System.out.println(h1);
		}
		Arrays.sort(h);
		System.out.println("Hotel name in Ascending :--------------- ");
		for(Hotel h1:h)
		{System.out.println(h1);
		}
		
		Arrays.sort(h , new HotelByDescName());
		System.out.println("Hotel name in Descending :---------------- ");
		for(Hotel h1:h)
		{System.out.println(h1);
		}
		
		
		Arrays.sort(h , new HotelByAscType());
		System.out.println("Hotel by type in Ascending :------------------- ");
		for(Hotel h1:h)
		{System.out.println(h1);
		}
		
		Arrays.sort(h , new HotelByDescType());
		System.out.println("Hotel by type in Descending :------------------ ");
		for(Hotel h1:h)
		{System.out.println(h1);
		}
		
		Arrays.sort(h , new HotelByAscStaffNum());
		System.out.println("Hotel by StaffNum in Ascending :------------------- ");
		for(Hotel h1:h)
		{System.out.println(h1);
		}
		
		Arrays.sort(h , new HotelByDescStaffNum());
		System.out.println("Hotel by StaffNUm in Descending :-------------------");
		for(Hotel h1:h)
		{System.out.println(h1);
		}
		
		
	}

}
