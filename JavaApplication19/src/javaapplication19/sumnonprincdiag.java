/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

/**
 *
 * @author Student
 */
import java.util.Scanner;
public class sumnonprincdiag {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,m,k=1,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of rows of matrix");
        n=sc.nextInt();
        System.out.println("enter no. of columns of matrix");
        m=sc.nextInt();
        int a[][] =new int[n][m];
        System.out.println("enter elements of matrix");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
                
        }
        if(n==m)
        {for(int i=0;i<n;i++)
        {
           
            sum=sum+a[i][m-k];
            k++;
                
        }
        System.out.println("sum of elements of non-principal diagonal is : "+sum);
        }
        else
        System.out.println("cannot find the non-principal diagonal");
        
    }
    
}