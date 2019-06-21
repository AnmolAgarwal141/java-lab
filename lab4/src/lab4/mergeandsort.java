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
public class mergeandsort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int n,m;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of elements in array 1");
        n=sc.nextInt();
        System.out.println("enter no. of elements in array 2");
        m=sc.nextInt();
        int a[] =new int[n];
        int b[]=new int[m];
        int c[]=new int[n+m];
        System.out.println("enter elements of matrix");
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            for(int i=0;i<m;i++)
            {
                b[i]=sc.nextInt();
            }
            int k=0;
            for(int i=0;i<n+m;i++)
            {
                if(i<n)
                    c[i]=a[i];
                else
                {    c[i]=b[k];
                      k++;            
                }
            }
            for(int i=0;i<n+m-1;i++)
            {
                for(int j=0;j<n+m-1-i;j++)
                {
                    if(c[j]>c[j+1])
                    {
                        int temp=c[j];
                        c[j]=c[j+1];
                        c[j+1]=temp;
                    }
                }
            }
            System.out.println("after merge and sort arrays into 1 array we get:");
           for(int i=0;i<n+m;i++)
               System.out.println(c[i]);
    }
    
}
