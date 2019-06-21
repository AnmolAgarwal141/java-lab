/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
import java.util.Scanner;
public class areacircum 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        double l,b;
       Scanner sc=new Scanner(System.in);
       System.out.println("length is" );
       l=sc.nextDouble();
       System.out.println("breadth is");
       b=sc.nextDouble();
       double area=l*b;
       double circumference=2*(l+b);
       System.out.println("area is" +area);
       System.out.println("circumference is" +circumference);
    }
}
   
