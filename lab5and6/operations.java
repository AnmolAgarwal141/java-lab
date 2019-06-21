/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *

/**
 *
 * @author Student
 */
import java.util.Scanner;
class Number
{
    private double a;
    Number(double b)
    {
        a=b;
    }
    boolean isZero()
    {
        if(a==0)
            return true;
        else
            return false;
    }
    boolean isPositive()
    {
        if(a>0)
            return true;
        else
            return false;
    }
    boolean isNegative()
    {
        if(a<0)
            return true;
        else
            return false;
    }
    boolean isOdd()
    {
        if(a%2!=0)
            return true;
        else
            return false;
    }
    boolean isEven()
    {
        if(a%2==0)
            return true;
        else
            return false;
    }
    boolean isPrime()
    {   int flag=0;int i;
        for(i=2;i<a;i++)
        {
            if(a%i==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
            return true;
        else
            return false;
    }
    boolean isArmstrong()
    {  int n,b,j,k=0,l=0;
        n=(int)(a);
        while(n!=0)
        {  
            n=n/10;
            l++;
        }
        n=(int)(a);
        while(n!=0)
        {   b=n%10;
            n=n/10;
            j= (int)(Math.pow(b,l));
            k=k+j;
        }
        if(k==(int)(a))
        {
           return true;
        }
        else
            return false;
    }
    
}
class operations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a number");
        double b=sc.nextDouble();
        Number n=new Number(b);
        System.out.println("To check no. is zero");
        System.out.println(n.isZero());
        System.out.println("To check no. is positive");
        System.out.println(n.isPositive());
        System.out.println("To check no. is negative");
        System.out.println(n.isNegative());
        System.out.println("To check no. is odd");
        System.out.println(n.isOdd());
        System.out.println("To check no. is even");
        System.out.println(n.isEven());
        System.out.println("To check no. is prime");
        System.out.println(n.isPrime());
        System.out.println("To check no. is armstrong ");
        System.out.println(n.isArmstrong());
    }
    
}
