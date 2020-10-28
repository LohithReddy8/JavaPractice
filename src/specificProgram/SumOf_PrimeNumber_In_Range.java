package specificProgram;

import java.util.Scanner;

public class SumOf_PrimeNumber_In_Range {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the Range to find Prime_Number");
	int num= scan.nextInt();
	int sum =0;
		
	for(int i=1; i<=num; i++)
	{	
		int count=0;		
		for(int x=1; x<=i; x++)
		{
			if(i%x==0)
			{
			count++;
			}	
		}
		
		if(count==2)
		{
		sum+=i;
		System.out.println(i+" ");
		}
	}
	System.out.println("Sum of Prime_num in the given range : "+sum);
}
}

