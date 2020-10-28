package specificProgram;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the number ");
		int num = scan.nextInt();
		
		int fact = 1;
		for(int x=1; x<=num ; x++)
		{
			fact = fact*x;
		}
		System.out.println("Factorial of "+num+" is "+fact);
	}

}
