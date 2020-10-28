package array;

public class ArraySort {
	
	public static void main(String[] args) {
		
			int [] x = {10,15,17,13,25,20};
			ArraySort a = new ArraySort();
			System.out.println("AscendingOrderSort :");
			a.ascendingsort(x);
			System.out.println("\n"+"DescendingOrderSort :");
			a.descendingsort(x);
		}
	public void ascendingsort(int [] x)
	{
		System.out.println("Array before sort:");
		for(int i: x)
		{
			System.out.print(i+"\t");
		}

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
		System.out.println("\n"+ "Array after Ascending Sort :");
		for( int i : x)
		{
			System.out.print(i+"\t");
		}	
	}
	public void descendingsort(int [] x)
	{
		System.out.println("Array before sort:");
		for(int i: x)
		{
			System.out.print(i+"\t");
		}

		for(int i=0; i < x.length; i++)
		{
			for(int j=i+1; j < x.length; j++)
			{
				if(x[i]<x[j])
				{
					int temp = x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}
		System.out.println("\n"+"Array after Ascending Sort :");
		for( int i : x)
		{
			System.out.print(i+"\t");
		}	
	}
}
	
