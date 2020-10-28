package array;
import java.util.Scanner;

public class FindGivenNum {
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		System.out.println("Enter a number to check");
		int x = s.nextInt();
		int [] y = { 10,15,17,13,25,20,};
		boolean z = false;
		for(int i=0; i<y.length; i++)
		{
			if(x == y[i])
			{
				z = true ;
				System.out.println("Number present at index of :" + i);
			}
		}
			if(z)
			{ 
			 System.out.println("Given number present in an array ");	
			}else
			{
				System.out.println("Given number not present in an array ");	
			}	
}
}
