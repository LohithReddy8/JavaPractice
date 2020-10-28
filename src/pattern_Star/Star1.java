package pattern_Star;

import java.util.Scanner;

public class Star1 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no fo rows to print");
		int row = scan.nextInt();
		int count = row;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=count;j++)
			{
				if( i==j || i+j==row+1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");			
				}	
			}
		System.out.println();
		}		
}
}

/*
 	
 *   * 
  * *
   *
  * *
 *   *
 
 */



