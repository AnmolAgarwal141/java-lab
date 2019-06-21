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
class box{
    int height;
    int width;
    int length;
    double volume;
    void read(int l,int w,int h)
    {
      height=h;
      width=w;
      length=l;
    }
    double solve()
    {
        volume=height*width*length;
        return volume;
    }
}
public class volume {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        box s=new box();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length width and height");
        int l=sc.nextInt();
        int w=sc.nextInt();
        int h=sc.nextInt();
        s.read(l,w,h);
        double vol=s.solve();
        System.out.println("volume of box is : "+ vol);
    }
    
}
