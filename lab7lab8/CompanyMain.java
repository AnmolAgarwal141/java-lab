/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.*;
 interface Company {
    void Sales(int a[]);
}
class Hardware implements Company{
    String cat,orig_man;
    Hardware(String c,String o)
    {cat=c;
    orig_man=o;
    }
   public void Sales(int a[]){
        double s=0.00;
        for(int x=0;x<3;x++)
           s+=a[x];
        System.out.println("Total Hardware Sales=Rs."+s);
    }
}
class Software implements Company{
    String soft_type,os;
    Software(String c,String o)
    {soft_type=c;
    os=o;
    }
 public void Sales(int a[]){
        double s=0.00;
        for(int x=0;x<3;x++)
           s+=a[x];
        System.out.println("Total Software Sales=Rs."+s);
    }
}
class CompanyMain{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        Hardware a=new Hardware("Mouse","HP");
        Software b=new Software("System","Windows XP");
        int q[]=new int[3];
        System.out.println("Enter hardware sales for 3 months:");
        for(int x=0;x<3;x++)
            q[x]=s.nextInt();
        a.Sales(q);
        System.out.println("Enter software sales for 3 months:");
        for(int x=0;x<3;x++)
            q[x]=s.nextInt();
        b.Sales(q);
    }
}
