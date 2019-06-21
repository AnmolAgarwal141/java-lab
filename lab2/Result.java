import java.util.Scanner;
class checking{
public static void main(String args[])
{int a,b;
Scanner sc=new Scanner(System.in);
System.out.println("enter a no. 'a'=");
a=sc.nextInt();
System.out.println("enter a no. 'b'=");
b=sc.nextInt();
System.out.println("value of :(a<<2)+(b>>2) is: "+ ((a<<2)+(b>>2)));
System.out.println("value of (b>0) is: "+ (b>0));
System.out.println("value of (a+b*100)/10 is : "+ ((a+b*100)/10));
System.out.println("value of a&b is : "+ (a&b));
}}