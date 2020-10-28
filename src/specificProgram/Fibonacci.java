package specificProgram;

import java.util.Scanner;

public class Fibonacci {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter the limit for Fibonacci series");
	int num = scan.nextInt();
		
		int x=0;
		int y=1;
		
		for(int f=1; f<=num; f++)
		{
			System.out.print(x+" ");
			int z=x+y;
			x=y;
			y=z;
		}
		System.out.println();
}
}
