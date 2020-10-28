package array;

import java.util.Scanner;

public class OccuranceOfGivenNUM {
	public static void main(String[] args) {
	
	Scanner s = new Scanner (System.in);
	System.out.println("Enter a number to check");
	int x = s.nextInt();
	int [] y = { 10,15,17,15,25,10,25,20,};
	boolean z = false;
	int count =0;
	for(int i=0; i<y.length; i++)
	{ if(x == y[i])
		{
		z = true ;
		count++;
		}
	}  if(z)
		{System.out.println("Occurance of given number in an array is :"+count);	
		}else
		{System.out.println("Given number not present in an array ");	
		}	
}

}
