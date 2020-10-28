package string;

public class SwapString {
	public static void main(String[] args) {
		String a = "Good";
		String b ="Morning";
		
		a = a+b;
		System.out.println(a.length());
		
		System.out.println("After swaping :");
		
		b = a.substring(0,a.length()-b.length());
		System.out.println("b value is :"+ b);
		
		a  = a.substring(b.length());
		System.out.println("a value is :"+ a);
	}

}

