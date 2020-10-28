package specificProgram;

public class OccuranceOfChar 
{
public static void main(String[] args)
	{	
		String s ="Ramayana";
		OccuranceOfChar oc = new OccuranceOfChar();
		oc.approach1(s);
		oc.approach2(s);
		oc.duplicate(s);
		oc.evenchar(s);
		oc.oddchar(s);
		oc.removeduplicate(s);
		oc.onlyduplicates(s);
		oc.vowels(s);
	}
	public void approach1(String s)
	{
	s = s.toLowerCase();
	
	for ( char c ='a'; c<='z';c++)
	{
		int count =0;
		for(int i=0; i<s.length();i++)
		{
			char c1 =s.charAt(i);
			if(c==c1)
			{
				count++;
			}
		}
		if (count>0)
		{
			System.out.println(c+" present "+count+" time ");
		}
	}
	}
	
	public  void approach2 (String s)
	{
		s =s.toLowerCase();
		
		for(int i=0; i<s.length();i++)
		{
			int count =0;
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j)&&i>j)
				{
					break;
				}
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
			if(count>0)
			{
				System.out.println(s.charAt(i)+" present "+count+" times ");
			}
		
		}
	}
	
	public void duplicate(String s)
	{
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++)
		{	
			int count =0;
			for(int j=0; j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j) && i>j)
				{
					break;
				}
				if (s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			 }
				if (count>1)
				{
					System.out.println("duplicate character present in"
							+ "given String is "+ s.charAt(i));
				}
		}
	 }
	
	public void evenchar(String s)
	{
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++)
		{
			if(i%2==0)
			{
				System.out.println("character present at"
						+ " even index of given String "+ s.charAt(i));
			}
		}
	}
	public void oddchar(String s)
	{
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++)
		{
			if(i%2!=0)
			{
				System.out.println("character present at"
						+ " odd index of given String "+ s.charAt(i));
			}
		}
	}

	public  void removeduplicate (String s)
	{   	
		String remdup =" ";
		s =s.toLowerCase();
		for(int i=0; i<s.length();i++)
		{
			int count =0;
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j)&&i>j)
				{
					break;
				}
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
			if(count==1)
			{char c = s.charAt(i);
			remdup = remdup + c ;
			}
		}
		System.out.println("String after removing duplicate "+ remdup);	
	}
	
	public  void onlyduplicates (String s)
	{   	
		String onlydup =" ";
		s =s.toLowerCase();
		for(int i=0; i<s.length();i++)
		{
			int count =0;
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
			if(count>1)
			{char c = s.charAt(i);
			onlydup = onlydup + c ;
			}
		}
		System.out.println("String with only duplicates "+ onlydup);	
	}
	public  void vowels (String s)
	{   
		s =s.toLowerCase();	
		String defaultvowels ="aeiou";
	
		for(int i=0; i<defaultvowels.length();i++)
		{
			int count =0;
			for(int j=0;j<s.length();j++)
			{
				if(defaultvowels.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
			if(count>0);
			{
			System.out.println(defaultvowels.charAt(i)+" comes "+count+" times ");	
			}
		}		
	}
}


