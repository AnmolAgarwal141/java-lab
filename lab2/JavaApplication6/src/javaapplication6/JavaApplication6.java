/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        double b;
        char d;
        byte c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an ineger no. : ");
        a=sc.nextInt();
        System.out.println("enter a double no. : ");
        b=sc.nextDouble();
        System.out.println("enter a character : ");
        d=sc.next().charAt(0);
        System.out.println("conversion of int to byte will give : "+(byte)a);
        System.out.println("conversion of char to int will give: " + (int)d);                
        System.out.println("conversion of double to byte will give : "+(byte)b);
        System.out.println("conversion of double to int will give : "+(int)b);
    }
    
}
