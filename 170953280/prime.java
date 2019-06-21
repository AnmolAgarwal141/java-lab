class prime{
public static void main(String args[])
  {
    int n ,m,i,j,flag=0;
	n=Integer.parseInt(args[0]);
	m=Integer.parseInt(args[1]);
	System.out.println("prime no. b/w" +n +"and" +m);
	for(i=n+1;i<m;i++)
	{ flag=0;
		for(j=2;j<i;j++)
	   { if(i%j==0)
	       { flag=1;
		     break;
		    }
		} 
      if(flag==0)
       { System.out.println(i);}	  
	}
  }
}  