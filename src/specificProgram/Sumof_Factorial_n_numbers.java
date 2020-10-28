package specificProgram;

import java.util.Scanner;

public class Sumof_Factorial_n_numbers {
	// Natural numbers & Whole numbers
public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the number ");
		int num = scan.nextInt();
		int sum_N =0; // Natural numbers then sum==0 @ no 0 here
		int sum_W =1; // whole numbers then sum==1 @ 0!==1
		int fact_N=1;
		int fact_W =1;
		for(int x=1; x<=num ; x++)
		{
			fact_N = fact_N *x;
			sum_N += fact_N;
		}
		for(int x=1; x<num ; x++)
		{
			fact_W = fact_W*x;
			sum_W += fact_W;
		}
		System.out.println("Factorial of first "+num+" Natural numbers is "+sum_N);
		System.out.println("Factorial of first "+num+" whole numbers is "+sum_W);
	}

}
