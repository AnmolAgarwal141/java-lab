/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
abstract class Area {
    abstract void Calc_Area();
}
class Rectangle extends Area{
    double a,b;
    Rectangle(double x,double y){
        a=x;
        b=y;}    
void Calc_Area(){
System.out.println("Area of reactangle:"+(a*b));        
    }
}
class Circle extends Area{
    double r;
    Circle(double c){
        r=c;
    }
    void Calc_Area(){
   System.out.println("Area of circle:"+(3.14*r*r));
    }
}
class AreaMain{
    public static void main(String args[]){
        Rectangle a=new Rectangle(12.5,10);
        Circle b=new Circle(12);
        a.Calc_Area();
        b.Calc_Area();       
    }
}