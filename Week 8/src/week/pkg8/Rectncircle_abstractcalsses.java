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
abstract class area{
    int length, breadth, radius;
    double area;
    abstract void calculatearea();    
}
class rectangle extends area{  
    Scanner sc= new Scanner(System.in);
    void calculatearea() {
        System.out.println("Enter length and breadth: ");
        length= sc.nextInt();
        breadth= sc.nextInt();
        area= length*breadth;
        System.out.println("Area of rectangle is: "+ area);     
    }    
}
class circle extends area{
    Scanner sc= new Scanner(System.in);
    void calculatearea() {
        System.out.println("Enter radius: ");
        radius= sc.nextInt();
        area= 3.14*radius*radius;
        System.out.println("Area of circle is: "+ area);   
    }    
}
public class Rectncircle_abstractcalsses{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the shape: ");
        System.out.println("1.Circle");
        System.out.println("2.Rectangle");
        
        int n = sc.nextInt();
        
        switch(n){
            case 1:
                circle c= new circle();
                c.calculatearea();
                break;
                
            case 2:
                rectangle r= new rectangle();
                r.calculatearea();
                break;
                
        }
                
        
        
        
    }    
}
