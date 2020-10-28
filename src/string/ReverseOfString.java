package string;

import java.util.Scanner;

public class ReverseOfString {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		
		String original = s.next();
		String reverse ="";
		System.out.println("-------------");
		
		for(int i = original.length()-1; i>=0; i--)
		{
			char temp = original.charAt(i);
			reverse = reverse + temp;
		}
		System.out.println("Reverse of given String is : " + reverse);	
	}
}
