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
public class largsmall {

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
        int larg=a[0];
        for(int i=0;i<n;i++)
        {
            if(a[i]>larg)
            {
              larg=a[i];
            }
        }
        int small=a[0];
        for(int i=0;i<n;i++)
        {
            if(a[i]<small)
            {
              small=a[i];
            }
        }
        System.out.println("largest no. in array is: "+larg);
         System.out.println("smallest no. in array is: "+small);
    }
    
}
