import java.io.*;
import java.util.*;
class final1{
  public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String s[]=new String[n+1];
	String s1[]=new String[n+1];
	int sum=0;
	for(int i=0;i<n;i++)
	{
	  s[i]=sc.nextLine();	
	}
	int q=sc.nextInt();
	for(int l=0;l<q;l++)
	{
	  s1[l]=sc.nextLine();	
      int b=s1[l].length();
	  //int h=s.indexof(s1[l]);
	  int h=Arrays.asList(s).indexOf(s1[l]);
	  for(int j=0;j<b;j++)
	  {
		  char k=s1[l].charAt(j);
		  sum=sum+(k-64);
	  }
	   int u=sum*(h+1);
	   System.out.println(u);
}
}
}