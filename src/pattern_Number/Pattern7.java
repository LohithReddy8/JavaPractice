package pattern_Number;

import java.util.Scanner;

public class Pattern7 {
	
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the no of rows");
	int row = scan.nextInt();
	int count = 1;
	
	for(int i=1; i<=row; i++)
	{
	
		for(int j=1;j<=count;j++)
		{
			if(j<=i)
			{
			System.out.print( j +" ");
		    }
			else
			{
				System.out.print(Math.abs(j-2*i) + " ");
			}
		}
		System.out.println();
		count+=2;
	    
	}
}
}

/* 1
   1 2 1
   1 2 3 2 1
   1 2 3 4 3 2 1
   1 2 3 4 5 4 3 2 1 */


