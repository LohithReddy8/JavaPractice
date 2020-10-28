package pattern_Number;

import java.util.Scanner;

public class Pattern4 {
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
			x=x+row-j;
		}
		System.out.println();
		count++;
	}
}
}

/* 1
   2 6
   3 7 10
   4 8 11 13
   5 9 12 14 15 */