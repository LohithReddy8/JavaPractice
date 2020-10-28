package specificProgram;

import java.util.Scanner;

public class Factorial_withoutloop {
	
	static int fact =1;
	static int i=1;
	
	
	public static void m1(int num)
	{
		if(i<=num)
		{
			fact =fact*i;
			i++;
			m1(num);
		}
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		
		m1(num);
		System.out.println("factorial of given number : "+fact);

	}
	
	
}
