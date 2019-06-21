/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author Student
 */
import java.util.Scanner;
public class magicsquare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,m,sum=0,sum1=0,k=0,flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of rows of matrix");
        n=sc.nextInt();
        System.out.println("enter no. of columns of matrix");
        m=sc.nextInt();
        
        int a[][] =new int[n][m];
        int sum2[]=new int[n];
        int sum3[]=new int[m];
       
        System.out.println("enter elements of matrix");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
                
        }
        for(int i=0;i<n;i++)
        {
           
            sum=sum+a[i][m-k];
            k++;
                
        }
        k=0;
        for(int i=0;i<n;i++)
        {
           
            sum1=sum1+a[i][k];
            k++;
                
        }
        for(int i=0;i<n;i++)
        { sum2[i]=0;
            for(int j=0;j<m;j++)
            {
                sum2[i]=sum2[i]+a[i][j];
            }
                
        }
        for(int i=0;i<m;i++)
        { sum3[i]=0;
            for(int j=0;j<n;j++)
            {
                sum3[i]=sum3[i]+a[i][j];
            }
                
        }
        for(int i=0;i<n-1;i++)
        {
            if(sum2[i]!=sum2[i+1])
                flag=1;
        }
        for(int i=0;i<m-1;i++)
        {
            if(sum3[i]!=sum3[i+1])
                flag=1;
        }
        if(flag==0)
        {
            if(sum!=sum1||sum!=sum2[0]||sum!=sum3[0]||sum1!=sum2[0]||sum1!=sum3[0]||sum2[0]!=sum3[0])
        {flag=1;}
        }
        if(flag==1)
        {
           System.out.println("MATRIX IS NOT MAGIC SQUARE"); 
        }
        else
            System.out.println("MATRIX IS MAGIC SQUARE");
    }
    
}
