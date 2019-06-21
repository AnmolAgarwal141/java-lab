class checknumbers{
public static void main(String args[])
{int a[]=new int[10];
int i,d=0,b=0,c=0;
for(i=0;i<10;i++)
{a[i]=Integer.parseInt(args[i]);}
for (i=0;i<10;i++)
{
     if(a[i]>0)
	     d++;
	else if(a[i]<0)
	     b++;
    else
	     c++;
}
System.out.println(" total no. of positive integers" +d);
System.out.println(" total no. of negative integers" +b);
System.out.println(" total no. of zeros" +c);
}}