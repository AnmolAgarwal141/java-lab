
/* * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
import java.util.Scanner;

class armstrong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,n,l=0,b;
        double j,k=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. to be checked :");
        a=sc.nextInt();
        n=a;
        while(a!=0)
        {  
            a=a/10;
            l++;
        }
        a=n;
        while(n!=0)
        {   b=n%10;
            n=n/10;
            j= Math.pow(b,l);
            k=k+j;
        }
        if(k==a)
        {
            System.out.println("No. is an armstrong no.");
        }
        else
            System.out.println("No. is not an armstrong no.");
        
    }
    
}
