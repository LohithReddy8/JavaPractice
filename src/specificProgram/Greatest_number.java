package specificProgram;

import java.util.Scanner;

public class Greatest_number{
	
	public static int m1(int x, int y, int z)
	{
	
		int p = x>y? x:y;
		int q = z>p? z:p;
		System.out.print("larger among the given three numbers is : ");
		return q;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the valve of x");
		int x = scan.nextInt();
		System.out.println("Enter the valve of y");
		int y = scan.nextInt();
		System.out.println("Enter the valve of z");
		int z = scan.nextInt();
		
		System.out.println(m1(x,y,z));	
	}
}
