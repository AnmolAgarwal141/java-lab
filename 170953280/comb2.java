class comb2{
public static void main(String args[])
  {int i,j,k,l;
  for (i=1;i<=4;i++)
     for (j=1;j<=4;j++)
	     for (k=1;k<=4;k++)
		     for (l=1;l<=4;l++)
			 { if(i!=j && j!=k && j!=l&& k!=l && i!=l &&i!=k && k!=l)
			 {
			 System.out.print(i+""+j+""+k+""+l);
	             System.out.println("");}	
}}}	