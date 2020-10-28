package specificProgram;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num= scan.nextInt();
		int count=0;
		
		for(int x=1; x<=num; x++)
		{
			if(num%x==0)
			{
			count++;
			}
		}
		
		if(count==2)
		{
		System.out.println("Given Number is a Prime Number");
		}
		else
		{
		System.out.println("Given Number is not a Prime Number");
		}
	}

}
