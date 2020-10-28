package registration;

public class AccountCreation {
	public static void main (String[]args)
	{
		AccountRegistration a1=new AccountRegistration("ABC","M","XYZ",12345678445l,8500774758l);
		System.out.println("Name is :" + a1.getName());
		System.out.println("Gender is :"+ a1.getGender());
		System.out.println("Address is :"+ a1.getAddress());
		System.out.println("Contactnum is :"+a1.getContactnum());
		System.out.println("Accountnum is :"+a1.getAccountnum());
		System.out.println("--------------");
		
		AccountRegistration a2=new AccountRegistration("AB1","M","XkZ",12545678445l,9500774758l);
		System.out.println("Name is :" + a2.getName());
		System.out.println("Gender is :"+ a2.getGender());
		System.out.println("Address is :"+ a2.getAddress());
		System.out.println("Contactnum is :"+a2.getContactnum());
		System.out.println("Accountnum is :"+a2.getAccountnum());
		System.out.println("--------------");
		
		AccountRegistration a3=new AccountRegistration("SHD","M","XYK",82345678445l,8600774758l);
		System.out.println("Name is :" + a3.getName());
		System.out.println("Gender is :"+ a3.getGender());
		System.out.println("Address is :"+ a3.getAddress());
		System.out.println("Contactnum is :"+a3.getContactnum());
		System.out.println("Accountnum is :"+a3.getAccountnum());
		System.out.println("--------------");
		
		a1.setAddress("VIP");
		System.out.println("NEw address of ABC: "+a1.getAddress());
		
		System.out.println("Account 1 is :"+a1.getAccountnum());
		System.out.println("Account 2 is :"+a2.getAccountnum());
		System.out.println("Account 3 is :"+a3.getAccountnum());
	}
}
