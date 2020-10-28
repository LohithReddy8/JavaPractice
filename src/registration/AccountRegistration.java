package registration;

public class AccountRegistration {
	
	private String name,gender,address;
	private long aadharnum,contactnum;
	static long count =123456791l;
	private long accountnum;

	AccountRegistration(String name,String gender, String address, long aadharnum,long contactnum)

	{
		this.name=name;
		this.gender =gender;
		this.address =address;
		this.aadharnum=aadharnum;
		this.contactnum=contactnum;
		accountnum = ++count;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName (String name)
	{
		this.name=name;
	}
	public String getGender()
	{
		return gender;
	}
	public void setGender(String Gender)
	{
		this.gender=gender;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public long getContactnum()
	{
		return contactnum;
	}
	public void setContactnum(long contactnum)
	{
		this.contactnum=contactnum;
	}
	public long getAadharnum()
	{
		return aadharnum;
	}
	public long getAccountnum()
	{
		return accountnum;
	}
}
