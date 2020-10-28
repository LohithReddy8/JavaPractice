package specificProgram;

import java.util.Scanner;

public class Number_within_Range {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter the number for lower limit of range");
	int num1 = scan.nextInt();
	System.out.println("Enter the number for upper limit of range");
	int num2 = scan.nextInt();
	System.out.println("Enter the number to check its range");
	int num = scan.nextInt();
	
	for( ; ; ) // while(true)
	{
			if(num>= num1 && num <= num2)
			{
				System.out.println("Number is with in the Range");
				break;
			} 
			
			else
			{
				System.out.println("Number is out of the Range");
				System.out.println("Re_Enter the number to check its Range");
				num=scan.nextInt();
			}
	}
}
}

/* for( ;(num<num1 || num>num2); )   or  while(num<num1 || num>num2)
 
	{
	system.out.println("Number is out of Range");
	System.out.println("Re_Enter the number to check its Range");
	num=scan.nextInt();
	}

	System.out.println("Number is with in the Range"):
*/
