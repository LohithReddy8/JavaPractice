package array;

public class LowestAndHighest {
	public static void main(String[] args) {
	int [] x = {20,50,30,80,90,40};
	
	for(int i=0; i < x.length; i++)
	{
		for(int j=i+1; j < x.length; j++)
		{
			if(x[i]>x[j])
			{
				int temp = x[i];
				x[i]=x[j];
				x[j]=temp;
			}
		}
	}
	System.out.println("lowest value present in an Array:" +x[0]);
	System.out.println("Highest value present in an Array:"+x[x.length-1]);				
}
}
