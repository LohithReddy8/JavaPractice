package array;

public class ReverseOfArray {
	public static void main(String[] args) {
		
		int[] originalArray = {10,20,30,40,50};
		int[] reverseArray = new int[originalArray.length];
		int count =0;
		
		System.out.println("Original Array is :");
		for(int i : originalArray)
		{
			System.out.println(i+"");
		}
		for(int i =originalArray.length-1; i>=0; i--)
		{
			reverseArray[count++]=originalArray[i];
		}
		System.out.println("Reverse of Array is :");
		for(int i:reverseArray)
		{
			System.out.println(i+"");
		}
}	}
