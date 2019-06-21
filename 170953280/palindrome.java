class palindrome{
public static void main(String args[])
{int a,b,c=0,h;
a=Integer.parseInt(args[0]);
h=a;
 while(a!=0)
 {b=a%10;
 a=a/10;
 c=c*10+b;
 }
 if(h==c)
 {System.out.println("no. is palindrome");}
 else
 {System.out.println("no. is not palindrome");}
 }}