import java.util.Scanner;
class Account 
{
  String name;
  long accno;
  char typeacc;
  double balance;
  Scanner sc=new Scanner(System.in);
  void set()
  {
     System.out.println("enter name ,acc no,acc type(C/S),balance");
	 name=sc.nextLine();
	 accno=sc.nextLong();
	 typeacc=sc.next().charAt(0);
	 balance=sc.nextDouble();
   }
   void display()
   { 
     System.out.println(name);
     System.out.println(accno);
	 System.out.println(typeacc);
	 System.out.println(balance);
   }
 };
 class currentaccount extends Account
 { 
     currentaccount(double bal)
	 {
		 balance=bal;
	 }
   void deposit()
   {
     System.out.println("enter amount to deposite");
	 double amount=sc.nextDouble();
	 System.out.println("new balance is:");
	 balance=balance+amount;
	 System.out.println(this.balance);
   }
   void withdraw()
   {
     System.out.println("enter amount to withdraw");
	 Double amount=sc.nextDouble();
	 System.out.println("new balance is:");
	 balance=balance-amount;
	 System.out.println(this.balance);
   }
   void checkbalance(double bal)
   {
     if(balance<bal)
	     {
		     System.out.println("min. balance not maintained");
             System.out.println("balance after impose service tax:");
             balance=balance-balance*10/100;
              System.out.println(this.balance);			 
         }
	 else
	     System.out.println("min. balance maintained");
   }
   
 };
 class savingaccount extends Account
 {
	 savingaccount(double bal)
	 {
		 balance=bal;
	 }
   void deposit()
   {
     System.out.println("enter amount to deposite");
	 Double amount=sc.nextDouble();
	 System.out.println("new balance is:");
	 balance=balance+amount;
	 System.out.println(this.balance);
   }
   void withdraw()
   {
     System.out.println("enter amount to withdraw");
	 Double amount=sc.nextDouble();
	 System.out.println("new balance is:");
	 balance=balance-amount;
	 System.out.println(this.balance);
   }
   void interest()
   {
     balance=balance+balance*3/100;
      System.out.println("balance after deposite interest" +this.balance);	  
   }
 };
 class accdetails
 { 
    public static void main(String args[])
	{
	   Account a=new Account();
	   a.set();
	   a.display();
	   currentaccount b=new currentaccount(a.balance);
	   savingaccount c=new savingaccount(a.balance);
	   if(a.typeacc=='C')
	   {
	      b.deposit();
		  b.withdraw();
		  b.checkbalance(100000);
	   }
	   else if(a.typeacc=='S')
	   {
	      c.deposit();
		  c.withdraw();
		  c.interest();
	   }
	}
}