package specificProgram;
import java.util.Scanner;

public class Armstrong {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter the number");
	int num = scan.nextInt();
	int temp = num;
	int count = 0;
	int sum = 0;
	
	while(temp>0)
	{
		temp = temp/10;
		count++;
	}
	 temp = num;
	
	 while(temp>0)
	{	int mod = temp%10;
		int i = 1;
			for(int x=1;x<=count;x++)
			{
			i=i*mod;
			}
		sum+=i;
		temp=temp/10;
	}
	 
	if(sum==num)
	{System.out.println("Given number is Armstromg");
	}
	else
	{System.out.println("Given number is not Armstrong");
	}
}
}
