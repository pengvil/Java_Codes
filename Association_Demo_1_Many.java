import java.lang.*;
class Account
{
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	public void setAccountNumber(int accountNumber){
		this.accountNumber = accountNumber;
	}
	public void setAccountHolderName(String accountHolderName){
		this.accountHolderName = accountHolderName;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	public int getAccountNumber(){return accountNumber;}
	public String getAccountHolderName(){return accountHolderName;}
	public double getBalance(){return balance;}
}
class Customer
{
	private String phnNumber;
	// array of objects created
	Account accounts[];	 
	
	public Customer(){}
	
	public Customer(String phnNumber, int sizeOfArray) // size of array passed 
	{
		this.phnNumber = phnNumber;
		accounts = new Account[sizeOfArray];
	}
	public void setPhnNumber(String phnNumber){
		this.phnNumber = phnNumber;
	}
	public String getPhnNumber(){
		return phnNumber;
	}
	public void showAllAccounts()
	{
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] != null)
			{
				System.out.println("--------------");
				System.out.println("AccountHolderName of Account["+ i + "]: "+accounts[i].getAccountHolderName());
				System.out.println("AccountNumber of Account["+ i + "]: "+accounts[i].getAccountNumber());
				System.out.println("Balance of Account["+ i + "]: "+accounts[i].getBalance());
				System.out.println();
			}
		}
	}
	
	public void insertAccount(Account a)
	{
		int flag = 0;
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] == null)
			{
				accounts[i] = a;
				flag = 1;
				break;
			}
		}
		if(flag == 1){System.out.println("----Inserted----");}
		else {System.out.println("----CanNot Insert----");}
	}
	
	public void removeAccount(Account a)
	{
		int flag = 0;
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] == a)
			{
				accounts[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
			System.out.println("----Removed----");
		else
			System.out.println("----CanNot Remove----");
	}
}

public class Association_Demo_1_Many
{
	public static void main(String args[])
	{
		Customer c1 = new Customer("+880123456789", 4);  // the customer with the given number will have these four accounts
		
		// multiples accounts created 
		Account a1 = new Account();
		a1.setAccountHolderName("OOP1 A");
		a1.setAccountNumber(11111111);
		a1.setBalance(2000.0);
		
		Account a2 = new Account();
		a2.setAccountHolderName("OOP1 B");
		a2.setAccountNumber(11111112);
		a2.setBalance(2500.0);
		
		Account a3 = new Account();
		a3.setAccountHolderName("OOP2 C");
		a3.setAccountNumber(11111113);
		a3.setBalance(2000.0);
		
		Account a4 = new Account();
		a4.setAccountHolderName("OOP2 D");
		a4.setAccountNumber(11111114);
		a4.setBalance(2500.0);
		
		Account a5 = new Account();
		a5.setAccountHolderName("OOP1 E");
		a5.setAccountNumber(11111115);
		a5.setBalance(2000.0);
		
		Account a6 = new Account();
		a6.setAccountHolderName("OOP1 F");
		a6.setAccountNumber(11111116);
		a6.setBalance(2500.0);
		
		c1.insertAccount(a1);
		c1.insertAccount(a2);
		c1.insertAccount(a3);
		c1.insertAccount(a5);
		// already maximum number of accounts inserted
		c1.insertAccount(a6);
		c1.insertAccount(a4);
		
		c1.showAllAccounts();
		
		c1.removeAccount(a2);
		c1.removeAccount(a5);
		
		c1.showAllAccounts();
		// trying to remove already removed account
		c1.removeAccount(a2);
		
		
	}
}