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
public class prime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of elements you want in array:");
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=2;j<a[i];j++)
            {
                if(a[i]%j==0)
                    flag=1;
            }
            if(flag==0)
                System.out.println(a[i]);
        }
    }
    
}
