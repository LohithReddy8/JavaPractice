package lohith2;

import java.util.Scanner;

public class AirtelCustomer {
	public static void main(String[] args) {
		
		Airtel a1 = Airtel.getAirtelInstance();
		System.out.println("-------------");
		Scanner s =new Scanner(System.in);
		System.out.println("Enter day and data :");
		int day = s.nextInt();
		int data = s.nextInt();
		a1.datause(day,data);
		
	}

}
