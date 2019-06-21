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
public class addmultiply {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,m,flag=0,g,h,option;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of rows of matrix");
        n=sc.nextInt();
        System.out.println("enter no. of columns of matrix");
        m=sc.nextInt();
        
        int a[][] =new int[n][m];
        int d[][]=new int[n][m];
        
        System.out.println("enter elements of matrix");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
                
        }
        System.out.println("enter no. of rows of matrix");
        g=sc.nextInt();
        System.out.println("enter no. of columns of matrix");
        h=sc.nextInt();
        int b[][]=new int[g][h];
        int c[][]=new int[n][h];
        for(int i=0;i<g;i++)
        {
            for(int j=0;j<h;j++)
            {
                 b[i][j]=sc.nextInt();
            }
        }
        System.out.println("ADDITION OF MATRIX IS:");
            if(n==g&&m==h)
            {
               for(int i=0;i<n;i++)
                {
                   for(int j=0;j<m;j++)
                   {
                    d[i][j]=a[i][j]+b[i][j];
                   }
                
                }
                for(int i=0;i<n;i++)
                     {
                       for(int j=0;j<h;j++)
                         {
                            System.out.print(d[i][j]+" ");
                         }
                      System.out.println("");
                
                    }
             }
            else
            System.out.println("Addition is not possible");

        if(m==g)
        {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<h;j++)
            {  c[i][j]=0;
                for(int k=0;k<m;k++)
                {
                    c[i][j]=c[i][j]+a[i][k]*b[k][j];
                }    
            }
                
        }
        
        System.out.println("MULTIPLICATION OF MATRIX IS:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<h;j++)
            {
                 System.out.print(c[i][j]+" ");
            }
            System.out.println("");
                
        }
        }
        else
        {
            System.out.println("matrix multiplication is not possible");
        
        }
        
    }
    
}
