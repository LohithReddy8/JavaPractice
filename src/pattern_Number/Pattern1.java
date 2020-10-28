package pattern_Number;

import java.util.Scanner;

public class Pattern1 {
	
	public static void main(String[]args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the no of rows");
		int row = scan.nextInt();
		int space = row-1;
		int count = 1;
		
		for(int i=1; i<=row; i++)
		{
			for(int j=1; j<=space; j++)
			{
				System.out.print("  ");
			}
			for(int k=1; k<=count;k++)
			{
				int x = i-k;
				if(x>=0)
				{
					System.out.print(x+" ");
				}
				else
				{
					int y=~x+1;
					System.out.print(y+" ");
				}
			}
			count+=2;
			space--;
			System.out.println();
		}	
	}
	}

	/* 
	     0
	    101
	   21012
	  3210123
	  
	 */




