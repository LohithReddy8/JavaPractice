package lohith2;

public class Airtel {
	static Airtel a;
	static int count =1;
	private int data =1000;
	private Airtel()
	{
		System.out.println("Welcome to Airtel");
		System.out.println("Resistration done successfully");
		System.out.println("Available data is :"+data+"mb");
		count++;
	}
	public void datause(int day, int data)
	{
		System.out.println("Day :"+day);
		System.out.println("Data consume :"+data);
		this.data  = this.data - data;
		databalance();
		
	}
	public void databalance()
	{
		if(data>=0)
		{
			System.out.println("available data is :"+data+"mb");
		}
		else
		{
			System.err.println("Data pack over,,,,");
			System.err.println("Please recharge soon,,,");
		}
		
	}
	public static Airtel getAirtelInstance()
	{	if(count==1)
		{
			a = new Airtel();
		}
		return a;
	}

}
