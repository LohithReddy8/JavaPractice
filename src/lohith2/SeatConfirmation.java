package lohith2;

import java.util.Scanner;

public class SeatConfirmation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the rank and dept");
		
		int rank = scan.nextInt();
		String dept =scan.next();
		
		Counselling c = new Counselling();
		Engineering e = c.seatallotment(rank,dept);
		e.allotment();	
	}

}
