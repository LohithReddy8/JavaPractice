package pattern_Number;

import java.util.Scanner;

public class Pattern2 {
	
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no of Rows");
		int row = scan.nextInt();
		int space = row-1;
		int x = 0;
		
		for(int i=1; i<=row; i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print("  ");
			}
			x=x+i;
			for(int k=x; k>x-i; k--)
			{
				System.out.print(k+" ");
			}
			System.out.println();
			space--;
		}
}
}

/*
          1
        3 2
      6 5 4
   10 9 8 7
   
 */

