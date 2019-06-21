/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
class Student_Detail {

    Scanner s=new Scanner(System.in);
 String name;
 int id;
 static String college_name="MIT"; 
 Student_Detail()
 {
     name=s.next();
     id=s.nextInt();     
 }        
 void display_details()
 {
     System.out.println(name+"\t"+id+"\t"+college_name+"\n");
 }
}
class Student_Detail_Main {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
        Student_Detail o[]=new Student_Detail[100];
        System.out.println("Enter number of students:");
        int n=s.nextInt();       
     System.out.println("Enter name and id:");
        for(int i=0;i<n;i++)
        {
            o[i]=new Student_Detail();
            
        }
        System.out.println("Name\tID\tCollege\n");
        for(int i=0;i<n;i++)
        {
            o[i].display_details();           
        }
    }
}

