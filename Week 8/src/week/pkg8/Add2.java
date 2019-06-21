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
interface shape {
    void area();
}
class Square implements shape{
    double length;
    Square(double l){
        length= l;
             
    }
    //@Override
    public void area() {
        System.out.println("Area of Square is: "+ length* length);
    }   
}
class Triangle implements shape{
    double base, height;
    Triangle(double b, double h){
       base=b;
       height=h;
    }
    //@Override
    public void area() {
        System.out.println("Area of Triangle is: "+ 0.5*base*height);
    }   
}

public class Add2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the shape: ");
        System.out.println("1.Triangle");
        System.out.println("2.Square");
        int n = sc.nextInt();
        switch(n){
            case 1:
                System.out.println("Enter the base: ");
                int b = sc.nextInt();
                System.out.println("Enter the height: ");
                int h = sc.nextInt();
                Triangle t;
                t = new Triangle(b,h);
                t.area();
                break;
            case 2:
                System.out.println("Enter the length: ");
                int l = sc.nextInt();
                
                Square s;
                s = new Square(l);
                s.area();
                break;
                
        }
    }
    

    
}
