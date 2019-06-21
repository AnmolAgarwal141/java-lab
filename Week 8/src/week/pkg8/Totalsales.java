/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week.pkg8;

/**
 *
 * @author Student
 */
import java.util.*;
interface company{
    void calculatesales();
}
class hardware implements company{
    String category, omanu;
    int htotal;
    
    hardware(){
        category= "magnetic stripe card";
        omanu= "IBM";
    }
    
    public void calculatesales(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter sales for last 3 months in hardware : ");
	System.out.println("Month 1: ");
	int a=sc.nextInt();
	
	System.out.println("Month 2: ");
	int b=sc.nextInt();
	
	System.out.println("Month 3: ");
	int c=sc.nextInt();
	
	htotal=a+b+c;
	System.out.println("The total sale in 3 months : "+htotal);
    }
    
    void display(){
        System.out.println("Hardware class.");
        System.out.println("Category: "+ category);
        System.out.println("Original Manufacturer: "+ omanu);
        System.out.println("Total sales in hardware: "+ htotal);
        
    }
    
}

class software implements company{
    String type, os;
    int stotal;
    software(){
        type= "Application software";
        os= "Android";
    }
    
    public void calculatesales(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter sales for last 3 months in software : ");
	System.out.println("Month 1: ");
	int a=sc.nextInt();
	
	System.out.println("Month 2: ");
	int b=sc.nextInt();
	
	System.out.println("Month 3: ");
	int c=sc.nextInt();
	
	stotal=a+b+c;
	System.out.println("The total sale in 3 months : "+stotal);
    }
    
    void display(){
        System.out.println("Software class.");
        System.out.println("Type of software: "+ type);
        System.out.println("Operating System: "+ os);
        System.out.println("Total sales in software: "+ stotal);
        
    }
}

public class Totalsales {
    public static void main(String args[]){
        software sw= new software();
        hardware hw= new hardware();
        int csales;
        sw.calculatesales();
        sw.display();
        System.out.println();
       
        hw.calculatesales();
        hw.display();
        System.out.println();
        
        csales= hw.htotal+ sw.stotal;
        System.out.println("Total sales for the company in 3 months: "+ csales);
    }
    
}
