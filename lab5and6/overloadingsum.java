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
 class complex
{
    int real;
    int complex;
    void add(int a,int r,int c)
    {
        real=a+r;
        complex=c;
    }
    void add(int r,int c,int r1,int c1)
    {
        real=r+r1;
        complex=c+c1;
    }
    void display()
    {
        System.out.println("sum is"+real+" i"+complex);
    }
    
   
}
class overloadingsum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        complex c2=new complex();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a integer");
        int a=sc.nextInt();
        System.out.println("enter a complex no.");
        int r=sc.nextInt();
        System.out.print("i");
        int c=sc.nextInt();
        System.out.println("enter a complex no.");
        int r1=sc.nextInt();
        System.out.print("i");
        int c1=sc.nextInt();
        System.out.println("sum of integer and complex no. is");
        c2.add(a, r, c);
        c2.display();
        System.out.println("sum of complex numbers . is");
        c2.add(r,c,r1,c1);
        c2.display();
    }
    
}
