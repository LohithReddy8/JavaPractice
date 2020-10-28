package lohith2;

public class Counselling {
	public Engineering seatallotment(int rank, String dept)
	{
		if(rank<=3000 && dept.equals("Engineering"))
		{
			return new Engineering();
		}
		else if(rank<=3000 && dept.equals("MECH"))
		{
			return new MECH();
		}
		else if(rank<=2000 && dept.equals("ECE"))
		{
			return new ECE();
		}
		else if(rank<=1000 && dept.equals("CSE"))
		{
			return new CSE();
		}
		else
		{
			return null;
		}
	}

}
