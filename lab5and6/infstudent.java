import java.util.Scanner;
class student
{ 
    long regno;
	String name;
	int age;
	Scanner sc=new Scanner(System.in);
	void set()
	{
	   System.out.println("enter name age and registration no. of student");
	   name=sc.nextLine();
	   age=sc.nextInt();
	   regno=sc.nextLong();
	
	}
	void display()
	{
	   System.out.println(name);
	   System.out.println(age);
	   System.out.println(regno);
	}
};
class UG extends student
{
   int semester;
   double fees;
   void set()
   {
      System.out.println("enter semester and fees");
	  semester=sc.nextInt();
	  fees =sc.nextDouble();
   }
   void display()
   {
      System.out.println("sem : "+semester);
	  System.out.println("fees : "+fees);
	}
};
class PG extends student
{
   int semester;
   double fees;
   void set()
   {
      System.out.println("enter semester and fees");
	  semester=sc.nextInt();
	  fees =sc.nextDouble();
   }
   void display()
   {
      System.out.println("sem : "+semester);
	  System.out.println("fees : "+fees);
	}
};

class infstudent
{
   public static void main(String args[])
   {
       student s=new student();
	   s.set();
	   s.display();
	   Scanner sd=new Scanner(System.in);
	   System.out.println("enter UG student or PG student(U/P)");
	   char g=sd.next().charAt(0);
	   UG a=new UG();
	   PG b=new PG();
	   if(g=='U')
	   {
	     a.set();
		 a.display();
		}
		else if(g=='P')
		{
		  b.set();
		  b.display();
		 }
	 }
}