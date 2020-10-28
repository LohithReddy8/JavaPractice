package string;

public class Swap {
	public static void main(String[] args) {
		int x = 10;
		int y = 12;
		
		/* int temp = x;
		   x = y;
		  y = temp;  */
		
		x= x +y;
		y = x-y;
		x = x-y;
		
		System.out.println("x Value is :" + x);
		System.out.println("y value is :" + y);
		
	}

}
