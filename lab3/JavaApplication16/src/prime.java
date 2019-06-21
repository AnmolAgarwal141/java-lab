/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
import java.util.Scanner;
public class prime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n ,m,i,j,flag;
	Scanner sc=new Scanner(System.in);
        System.out.println("enter first no and last no");
        n=sc.nextInt();
        m=sc.nextInt();
	System.out.println("prime no. b/w" +n +"and" +m);
	for(i=n+1;i<m;i++)
	{ 
            flag=0;
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
