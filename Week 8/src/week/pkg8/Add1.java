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
abstract class Area{
    int length, base, height;
    double area;
    abstract void calculatearea();    
}
class square extends Area{  
    Scanner sc= new Scanner(System.in);
    void calculatearea() {
        System.out.println("Enter length: ");
        length= sc.nextInt();
        area= length*length;
        System.out.println("Area of square is: "+ area);     
    }    
}
class triangle extends Area{
    Scanner sc= new Scanner(System.in);
    void calculatearea() {
        System.out.println("Enter base: ");
        base= sc.nextInt();
        System.out.println("Enter height: ");
        height= sc.nextInt();
        area= 0.5*base*height;
        System.out.println("Area of triangle is: "+ area);   
    }    
}
public class Add1 {
      public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the shape: ");
        System.out.println("1.Triangle");
        System.out.println("2.Square");
        
        int n = sc.nextInt();
        
        switch(n){
            case 1:
                triangle t= new triangle();
                t.calculatearea();
                break;
                
            case 2:
                square s= new square();
                s.calculatearea();
                break;
                
        }
      }}
                
        
        
  
    

