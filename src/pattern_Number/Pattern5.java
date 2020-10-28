package pattern_Number;

import java.util.Scanner;

public class Pattern5{
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the no of rows");
	int row = scan.nextInt();
	int count = 1;
	
	for(int i=1; i<=row; i++)
	{
		int x=i;
		for(int j=1;j<=count;j++)
		{
			System.out.print( x +" ");
			x=x-1;
		}
		
		System.out.println();
		count++;
	}
}
}

/* 1
   2 1
   3 2 1
   4 3 2 1
   5 4 3 2 1 */
