/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;

/**
 *
 * @author Student
 */
import java.util.Scanner;
class time
{
    int hours;
    int minutes;
    int seconds;
    time()
    {
        hours=minutes=seconds=0;
    }
    time(int h,int m,int s)
    {
        hours=h;
        minutes=m;
        seconds=s;
    }
    void display()
    {
        System.out.println("time is : "+hours+":"+minutes+":"+seconds);
                
    }
    void sum(time t1,time t2)
    {
      seconds=t1.seconds+t2.seconds;
      minutes=t1.minutes+t2.minutes;
      hours=t1.hours+t2.hours;
              if(seconds>60)
              {
                 seconds=seconds-60;
                 minutes++;
              }
              if(minutes>60)
              {
                  minutes=minutes-60;
                 hours++; 
              }
              if(hours>24)
              {
                  hours=hours-24;
              }
    }
}
public class addtime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        time t1=new time();
        time t2=new time();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter time in hh mm and ss");
        int h=sc.nextInt();
        int m=sc.nextInt();
        int s=sc.nextInt();
        time t3=new time(h,m,s);
        t3.display();
         System.out.println("enter time in hh mm and ss ");
         h=sc.nextInt();
         m=sc.nextInt();
         s=sc.nextInt();
        time t4=new time(h,m,s);
        t4.display();
        t1.sum(t3,t4);
        System.out.print("after sum ");
        t1.display();
        
    }
    
}
