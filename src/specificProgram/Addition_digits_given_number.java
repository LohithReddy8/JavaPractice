package specificProgram;

import java.util.Scanner;

public class Addition_digits_given_number {
	
public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number");
		int num = scan.nextInt();
		int temp = num;
		int sum =0;
	
		while(temp>0)
		{
		int mod = temp%10;
		sum+=mod;
		temp=temp/10;
		}
		
	System.out.println("Addition of digits in "+num+" is "+sum);
}
}
