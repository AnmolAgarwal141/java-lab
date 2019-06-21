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
interface Shape {
    void area();
}
class Rectangle implements Shape{
    double length, breadth;
    Rectangle(double l, double b){
        length= l;
        breadth= b;      
    }
    //@Override
    public void area() {
        System.out.println("Area of rectangle is: "+ length* breadth);
    }   
}
class Circle implements Shape{
    double pi, radius;
    Circle(double r){
        pi= 3.14;
        radius= r;
    }
    //@Override
    public void area() {
        System.out.println("Area of circle is: "+ pi*radius*radius);
    }   
}

public class RectanglenCircle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the shape: ");
        System.out.println("1.Circle");
        System.out.println("2.Rectangle");
        int n = sc.nextInt();
        switch(n){
            case 1:
                System.out.println("Enter the radius: ");
                int r = sc.nextInt();
                Circle c;
                c = new Circle(r);
                c.area();
                break;
            case 2:
                System.out.println("Enter the length and bredth: ");
                int l = sc.nextInt();
                int b = sc.nextInt();
                Rectangle rec;
                rec = new Rectangle (l,b);
                rec.area();
                break;
                
        }
    }
    
}
