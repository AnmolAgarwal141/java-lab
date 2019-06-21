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
public class searching {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[]={1,2,3,4,5,4,3,2,1,4,5,3,6};
        int b[]=new int[13];
        int n,k = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("input array is:");
        for(int i=0;i<13;i++)
        {
            System.out.println(a[i]);
        }      
        System.out.println("enter no. to be searched from above array:");
        n=sc.nextInt();
        System.out.println("no. is found at :");
        for(int i:a)
        {   k++;
            if(i==n)
            {  
             System.out.println(k);
            }
        }    
        System.out.println("positions");
                    
    }
    
}
