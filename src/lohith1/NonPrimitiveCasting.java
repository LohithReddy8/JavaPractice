package lohith1;

public class NonPrimitiveCasting {
	public static void main(String[] args) {
		
		Paytm p=new Paytm();
		p.payment();
		
		// Method overiding 
		Icici i = new Icici();
		i.payment();
		Sbi s = new Sbi();
		s.payment();
		
		// 	Up casting
		Paytm p1 =new Icici();
		p1.payment();
		Paytm p2 = new Sbi();
		p2.payment();
		
		// Down casting
		Icici i1 =(Icici) p1;
		i1.payment();
		Sbi s1 =(Sbi) p2;
		s1.payment();	
	}
}
