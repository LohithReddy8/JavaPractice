// Odd number pattern //
package pattern_Number;

import java.util.Scanner;

public class Pattern3 {
public static void main(String[] args) {
	
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter the no of rows");
	int row =scan.nextInt();
	int count=1;
	
	for(int i=1;i<=row;i++)
	{
		for(int j=i;j<=count;j++)
		{
			System.out.print(2*j-1 + " ");
		}
	System.out.println();
	count+=2;
	}
}
}

/*
 1
 3 5
 5 7 9
 7 9 11 13
 9 11 13 15 17
 */
