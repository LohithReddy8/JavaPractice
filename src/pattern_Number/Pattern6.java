package pattern_Number;

import java.util.Scanner;
public class Pattern6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no of rows");
		int row =scan.nextInt();
		int space =row-1;
		int count =1;
		int x=row;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=count;k++)
			{
				if( i%2!=0 && k==2)
				{
					System.out.print("  ");
					x++;
				}
				else
				{
					System.out.print(x+" ");
					x++;
				}
			}
			System.out.println();
			x=row-i;
			space--;
			count++;
		}
	}

}

/*          6
          5 6
        4   6
      3 4 5 6
    2   4 5 6
  1 2 3 4 5 6
 */
