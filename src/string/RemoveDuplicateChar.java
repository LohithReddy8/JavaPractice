package string;

import java.util.Scanner;

public class RemoveDuplicateChar {
	
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the String");
	String s = scan.next();
	String withoutdupli="";
	for(int i=0; i<s.length(); i++)
	{ int count=0;
		for(int j= 0;j<s.length();j++)
		{	
			if(s.charAt(i)==s.charAt(j) && i>j )
			{break;
			}
			if(s.charAt(i) == s.charAt(j))
			{count++;
			}
		}
		if(count==1)
		{
			withoutdupli  = withoutdupli + s.charAt(i);
		}
	}
	System.out.println("Given String with out duplicate : "+ withoutdupli);
	
}
}
