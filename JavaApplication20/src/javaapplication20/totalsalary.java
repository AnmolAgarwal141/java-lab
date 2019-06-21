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
class Employee
{
    String name;
    String city;
    double basicsalary;
    double HRA;
    double DA;
    double salary;
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name of employee");
        name=sc.next();
        System.out.println("enter city of employee");
        city=sc.next();
        System.out.println("enter basic salary of employee");
        basicsalary=sc.nextDouble();
        System.out.println("enter percentage of dearnes allowance");
        DA=sc.nextDouble();
        System.out.println("enter percentage of house rent allowance");
        HRA=sc.nextDouble();
    }
    void calculate()
    {
     salary=basicsalary+basicsalary*DA/100+basicsalary*HRA/100;
    }
    void display()
    {
        System.out.println("total salary of employee is: "+ salary);
    }
}

public class totalsalary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee e1=new Employee();
        Employee e2=new Employee();
        e1.getdata();
        e1.calculate();
        e1.display();
        e2.getdata();
        e2.calculate();
        e2.display();
        
    }
    
}
