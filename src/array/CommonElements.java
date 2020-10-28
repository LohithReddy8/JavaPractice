package array;
import java.util.Scanner;

public class CommonElements {
public static void main(String[] args) {
	int [] x = {10,15,20,46,25,30};
	int [] y = {1,15,17,13,20,46};
	boolean z = false;
	int count =0;
	System.out.println("Common Element in two Arrays are :");
	for(int i=0; i<x.length; i++)	
	{
		for(int j=0; j<y.length; j++)
		{ 	
			if(x[i]==y[j])
			{
			z =true;
			count++;
			System.out.print( x[i]+" ");	
			}
		}
	}
		if(z)
		{
		System.out.println("\n"+"No of common Element in two Arrays are :"+count);
		}
		else				
		{
		System.out.println("No Common Elements present in an array ");	
		}			
}
}

