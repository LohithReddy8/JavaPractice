package specificProgram;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		int temp = num;
		int sum=0;
		
		while(temp>0)
		{
			int mod=temp%10;
			sum=sum*10+mod;
			temp=temp/10;
		}
		
		if(sum==num)
		{
			System.out.println("Given number is Palindrome");
		}
		else
		{
			System.out.println("Given number is not Palindrome");
		}
	}

}
