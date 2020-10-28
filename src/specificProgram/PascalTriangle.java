package specificProgram;

import java.util.Scanner;

public class PascalTriangle {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the no of rows");
		int row = scan.nextInt();
		int space = row;
		int n=1;
		
		for(int i=1; i<=row ;i++)
		{
			for(int j=row; j>i; j--)
			{
			System.out.print(" ");
			}
			
			for(int k=1; k<=i;k++)
			{
			System.out.print( n +" ");
	         n = n * (i-k) / k;
			}
			n=1;
			
			System.out.println();  
		}
}
}

/*     1
      1 1
     1 2 1
    1 3 3 1
   1 4 6 4 1
   
 */
