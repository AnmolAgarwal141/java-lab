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
public class traceandnorm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,sum=0,sum1=0,k=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of rows/column of square matrix");
        n=sc.nextInt();
        int a[][] =new int[n][n];
        System.out.println("enter elements of square matrix");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
                
        }
        for(int i=0;i<n;i++)
        {
           
            sum=sum+a[i][k];
            k++;
                
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                sum1=sum1+a[i][j]*a[i][j];
            }
                
        }
        double root=Math.sqrt(sum1);
        System.out.println("trace of square matrix is: "+sum);
        System.out.println("norm of square matrix is: "+root);
    }
    
}
