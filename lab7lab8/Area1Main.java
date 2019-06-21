/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 interface Interface_Area {
    void Calc_Area();
}
class Rectangle1 implements Interface_Area{
    double a,b;
    Rectangle1(double x,double y){
        a=x;
        b=y;}    
public void Calc_Area(){
System.out.println("Area of reactangle:"+(a*b));        
    }
}
class Circle1 implements Interface_Area{
    double r;
    Circle1(double c){
        r=c;
    }
 public void Calc_Area(){
   System.out.println("Area of circle:"+(3.14*r*r));
    }
}
class Area1Main{
    public static void main(String args[]){
        Rectangle1 a=new Rectangle1(12.5,10);
        Circle1 b=new Circle1(12);
        a.Calc_Area();
        b.Calc_Area();       
    }
}
