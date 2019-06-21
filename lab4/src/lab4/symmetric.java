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
public class symmetric {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,m,flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of rows of matrix");
        n=sc.nextInt();
        System.out.println("enter no. of columns of matrix");
        m=sc.nextInt();
        int a[][] =new int[n][m];
        int b[][]=new int[m][n];
        int c[][]=new int[n][n];
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
            for(int j=0;j<m;j++)
            {
                b[i][j]=a[j][i];
            }
                
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {  c[i][j]=0;
                for(int k=0;k<m;k++)
                {
                    c[i][j]=c[i][j]+a[i][k]*b[k][j];
                }    
            }
                
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(c[i][j]!=a[i][j])
            {
                flag=1;
            }
            }
        }
        if(flag==1)
        {System.out.println("MATRIX IS NOT SYMMETRIC");}
        else
        {System.out.println("MATRIX IS SYMMETRIC");}
        }
        
        
    }
    
