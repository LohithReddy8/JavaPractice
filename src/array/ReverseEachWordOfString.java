package array;

public class ReverseEachWordOfString {
 public static void main(String[] args) {
	 
	String s = "java is very easy language";
	System.out.println(s);
	
	String[] str = s.split(" ");
	
	String reverse ="";
	
	for(String s1:str)
	{
		for(int i= s1.length()-1;i>=0;i--)
		{
		reverse = reverse + s1.charAt(i);
		}
		reverse = reverse +" ";
	}
	
	System.out.println(reverse);		
}
}
